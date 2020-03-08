package com.readify.bookpublishing.application.service.createchapter

import com.readify.bookpublishing.domain.book.AuthorId
import com.readify.bookpublishing.domain.book.BookId
import com.readify.bookpublishing.domain.book.BookRepository
import com.readify.bookpublishing.domain.chapter.Chapter
import com.readify.bookpublishing.domain.chapter.ChapterFactory
import com.readify.bookpublishing.domain.chapter.ChapterRepository

class CreateChapterService(
    private val bookRepository: BookRepository,
    private val chapterRepository: ChapterRepository,
    private val chapterFactory: ChapterFactory
) {
    fun execute(request: CreateChapterRequest): CreateChapterResponse {
        val book = bookRepository.findById(BookId(request.bookId)) ?: return BookNotFoundResponse

        return if (!book.sameAuthor(AuthorId(request.authorId)))
            BookNotBelongToAuthorResponse
        else
            chapterFactory.create(book.authorId, book.id, request.title, request.content)
                .also { chapterRepository.save(it) }
                .toResponse()
    }

    private fun Chapter.toResponse() =
        ChapterCreatedResponse(id.value, title.value, content.value, modifiedAt, authorId.value, bookId.value)
}