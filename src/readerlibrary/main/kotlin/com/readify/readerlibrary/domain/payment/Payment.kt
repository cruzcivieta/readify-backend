package com.readify.readerlibrary.domain.payment

import com.readify.readerlibrary.domain.book.BookId
import com.readify.readerlibrary.domain.chapter.ChapterId
import com.readify.shared.domain.clock.Clock
import com.readify.shared.domain.event.RootAggregate
import com.readify.shared.domain.event.payment.PaymentCompleted
import com.readify.shared.domain.event.payment.PaymentType
import com.readify.shared.domain.money.Money
import java.time.ZonedDateTime
import java.util.UUID

sealed class Payment(
    open val id: PaymentId, open val readerId: ReaderId, open val status: Status, open val amount: Money,
    open val startedAt: ZonedDateTime, open val completedAt: ZonedDateTime?
) : RootAggregate() {
    abstract fun complete(): Payment
}

data class BookPayment(
    override val id: PaymentId, override val readerId: ReaderId, override val status: Status,
    override val amount: Money, val bookId: BookId, override val startedAt: ZonedDateTime = Clock().now(),
    override val completedAt: ZonedDateTime? = null
) : Payment(id, readerId, status, amount, startedAt, completedAt) {
    override fun complete() =
        copy(status = Status.COMPLETED, completedAt = Clock().now())
            .also {
                it.record(
                    PaymentCompleted(
                        it.id.value,
                        it.readerId.value,
                        it.amount,
                        it.bookId.value,
                        null,
                        it.startedAt,
                        it.completedAt!!,
                        PaymentType.BOOK
                    )
                )
            }
}

data class ChapterPayment(
    override val id: PaymentId, override val readerId: ReaderId, override val status: Status,
    override val amount: Money, val bookId: BookId, val chapterId: ChapterId,
    override val startedAt: ZonedDateTime = Clock().now(), override val completedAt: ZonedDateTime? = null
) : Payment(id, readerId, status, amount, startedAt, completedAt) {
    override fun complete() =
        copy(status = Status.COMPLETED, completedAt = Clock().now())
            .also {
                it.record(
                    PaymentCompleted(
                        it.id.value,
                        it.readerId.value,
                        it.amount,
                        it.bookId.value,
                        it.chapterId.value,
                        it.startedAt,
                        it.completedAt!!,
                        PaymentType.CHAPTER
                    )
                )
            }
}

data class PaymentId(val value: String)
enum class Status { PENDING, COMPLETED }
data class ReaderId(val value: String) {
    init {
        UUID.fromString(value)
    }
}