package com.example.sho.gof.iterator

import android.util.Log

/**
 * BookShelfのインスタンス
 *
 * Created by sho on 2018/10/04.
 */
class Instance {
    fun iterator() {
        val bookShelf = BookShelf()
        bookShelf.apply {
            appendBook(Book("kotlinスタートブック"))
            appendBook(Book("kotlin in action"))
            appendBook(Book("kotlin助走本"))
            appendBook(Book("kotlinハンドブック"))
        }

        val iterator: Iterator = bookShelf.iterator
        while (iterator.hasNext) {
            val book: Book = iterator.next as Book
            Log.d("title", book.name)
        }
    }
}