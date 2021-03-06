package com.readify.readerlibrary.domain.book

interface BookRepository {
    fun save(book: Book)
    fun findById(bookId: BookId): Book?
    fun findByIds(books: List<BookId>): List<Book>
}
