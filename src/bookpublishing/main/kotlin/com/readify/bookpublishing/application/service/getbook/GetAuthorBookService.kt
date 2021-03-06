package com.readify.bookpublishing.application.service.getbook

import com.readify.bookpublishing.application.service.common.BookStatus
import com.readify.bookpublishing.application.service.common.BookVisibility
import com.readify.bookpublishing.domain.book.AuthorId
import com.readify.bookpublishing.domain.book.Book
import com.readify.bookpublishing.domain.book.BookId
import com.readify.bookpublishing.domain.book.BookRepository
import com.readify.bookpublishing.domain.book.FinishedBook
import com.readify.bookpublishing.domain.book.InProgressBook
import com.readify.shared.domain.book.Visibility

class GetAuthorBookService(private val bookRepository: BookRepository) {
    fun execute(requestAuthor: GetAuthorBookRequest) =
        bookRepository.findById(BookId(requestAuthor.bookId))
            ?.takeIf { it.isWrittenBy(AuthorId(requestAuthor.authorId)) }
            ?.toResponse()
            ?: AuthorBookNotFoundResponse
}

private fun Book.toResponse() =
    when (this) {
        is InProgressBook -> AuthorBookFoundResponse(
            authorId.value, id.value, title.value, summary.value, cover.value, tags.value, price.amount,
            price.currency.toString(), BookStatus.IN_PROGRESS, visibility.toResponse(), null, completionPercentage.value
        )
        is FinishedBook -> AuthorBookFoundResponse(
            authorId.value, id.value, title.value, summary.value, cover.value, tags.value, price.amount,
            price.currency.toString(), BookStatus.FINISHED, visibility.toResponse(), finishedAt,
            completionPercentage.value
        )
    }

private fun Visibility.toResponse() =
    when (this) {
        Visibility.NULL -> BookVisibility.NULL
        Visibility.RESTRICTED -> BookVisibility.RESTRICTED
        Visibility.VISIBLE -> BookVisibility.VISIBLE
    }
