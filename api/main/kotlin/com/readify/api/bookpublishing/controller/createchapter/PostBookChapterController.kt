package com.readify.api.bookpublishing.controller.createchapter

import com.readify.authentication.domain.AnonymousUser
import com.readify.authentication.domain.LoggedUser
import com.readify.authentication.domain.Requester
import com.readify.bookpublishing.application.service.createchapter.BookNotBelongToAuthorResponse
import com.readify.bookpublishing.application.service.createchapter.BookNotFoundResponse
import com.readify.bookpublishing.application.service.createchapter.ChapterCreatedResponse
import com.readify.bookpublishing.application.service.createchapter.CreateChapterRequest
import com.readify.bookpublishing.application.service.createchapter.CreateChapterResponse
import com.readify.bookpublishing.application.service.createchapter.CreateChapterService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class PostBookChapterController(private val createChapterService: CreateChapterService) {
    @PostMapping("/books/{bookId}/chapters")
    fun createBook(
        @RequestBody httpRequest: PostBookChapterHttpRequest,
        @PathVariable bookId: String,
        requester: Requester
    ): ResponseEntity<PostBookChapterHttpResponse> =
        when (requester) {
            is AnonymousUser -> ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()
            is LoggedUser -> createChapterService
                .execute(httpRequest.toServiceRequest(requester, bookId))
                .toHttpResponse()
        }
}

private fun CreateChapterResponse.toHttpResponse(): ResponseEntity<PostBookChapterHttpResponse> =
    when (this) {
        is BookNotFoundResponse, BookNotBelongToAuthorResponse -> ResponseEntity.notFound().build()
        is ChapterCreatedResponse -> ResponseEntity.ok(
            PostBookChapterHttpResponse(id, title, content, modifiedAt, bookId, authorId)
        )
    }

private fun PostBookChapterHttpRequest.toServiceRequest(requester: LoggedUser, bookId: String) =
    CreateChapterRequest(title, content, requester.id, bookId)