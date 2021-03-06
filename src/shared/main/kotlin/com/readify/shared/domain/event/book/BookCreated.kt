package com.readify.shared.domain.event.book

import com.readify.shared.domain.book.Visibility
import com.readify.shared.domain.event.DomainEvent
import com.readify.shared.domain.money.Money
import java.time.LocalDateTime

data class BookCreated(
    val id: String,
    val authorId: String,
    val title: String,
    val cover: String,
    val summary: String,
    val tags: List<String>,
    val price: Money,
    val completionPercentage: Int,
    val visibility: Visibility,
    override val occurredOn: LocalDateTime = LocalDateTime.now()
) : DomainEvent(occurredOn)
