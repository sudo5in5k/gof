package com.example.sho.gof.iterator

/**
 * 本棚のクラス
 * 具体的なAggregator
 *
 *
 * Created by sho on 2018/10/04.
 */

class BookShelf : Aggregate {
    override val iterator: Iterator
        get() = BookShelfIterator(this)

    var books = ArrayList<Book>()

    fun getBookAt(index: Int): Book {
        return books[index]
    }

    fun appendBook(book: Book) {
        this.books.add(book)
    }

    fun getLength() = this.books.size
}
