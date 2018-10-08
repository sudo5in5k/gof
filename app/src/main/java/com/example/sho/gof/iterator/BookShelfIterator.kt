package com.example.sho.gof.iterator

/**
 * Bookクラスに対するConcrete Iterator
 *
 * Created by sho on 2018/10/04.
 */
class BookShelfIterator(private var bookShelf: BookShelf): Iterator {

    private var index: Int = 0

    override val hasNext: Boolean
        get() = index < bookShelf.getLength()

    override val next: Any
        get() {
            val book = bookShelf.getBookAt(index)
            index++
            return book
        }

}