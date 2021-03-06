package com.readify.readerlibrary.domain.book

import com.readify.shared.domain.book.Status
import com.readify.shared.domain.money.Currency
import com.readify.shared.domain.money.Money
import java.util.UUID

class BookMother {
    fun inProgressBook(
        bookId: String,
        authorId: String = AUTHOR_ID,
        completionPercentage: Int = 0,
        title: String = TITLE,
        tags: List<String> = TAGS
    ) =
        Book(
            BookId(bookId),
            AuthorId(authorId),
            Title(title),
            Cover("https://images-na.ssl-images-amazon.com/images/I/51HSkTKlauL._SX346_BO1,204,203,200_.jpg"),
            Summary("Harry hasn't had a birthday party in eleven years - but all that is about to change when a mysterious letter arrives with an invitation to an incredible place."),
            Tags(tags),
            Money(1f, Currency.EUR),
            CompletionPercentage(completionPercentage),
            Status.IN_PROGRESS,
            null
        )

    companion object {
        private const val TITLE = "Harry Potter and the philosopher's stone"
        private val TAGS = listOf("fantasy", "magic")
        private val AUTHOR_ID = UUID.randomUUID().toString()
    }
}