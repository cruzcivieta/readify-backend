package com.readify.bookpublishing.domain.chapter

import assertk.assertThat
import assertk.assertions.hasSize
import assertk.assertions.isEqualTo
import assertk.assertions.isInstanceOf
import assertk.assertions.isNotNull
import com.readify.bookpublishing.domain.book.AuthorId
import com.readify.bookpublishing.domain.book.BookId
import com.readify.shared.domain.event.book.ChapterCreated
import com.readify.shared.domain.event.bus.EventBus
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import java.util.UUID

class ChapterFactoryShould {
    private val eventBus: EventBus = mockk(relaxed = true)
    private val chapterFactory = ChapterFactory(eventBus)

    @Test
    fun `create chapter and publish domain events`() {
        val authorId = AuthorId(UUID.randomUUID().toString())
        val bookId = BookId(UUID.randomUUID().toString())

        val actual = chapterFactory.create(authorId, bookId, "any title", "any chapter content")

        assertThat(actual.authorId).isEqualTo(authorId)
        assertThat(actual.bookId).isEqualTo(bookId)
        assertThat(actual.id).isNotNull()
        assertThat(actual.title).isEqualTo(Title("any title"))
        assertThat(actual.content).isEqualTo(Content("any chapter content"))
        assertThat(actual.modifiedAt).isNotNull()
        verify { eventBus.publish(actual.pullDomainEvents()) }
        assertThat(actual.pullDomainEvents()).hasSize(1)
        assertThat(actual.pullDomainEvents()[0]).isInstanceOf(ChapterCreated::class)
    }
}