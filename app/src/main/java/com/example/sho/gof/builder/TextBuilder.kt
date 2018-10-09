package com.example.sho.gof.builder

/**
 * Concrete TextBuilder
 *
 * Created by sho on 2018/10/09.
 */
class TextBuilder : Builder {

    var buffer : StringBuffer = StringBuffer()

    override fun makeTitle(title: String) {
        buffer.append("======================\n")
        buffer.append("|$title|")
        buffer.append("\n")
    }

    override fun makeBody(body: String) {
        buffer.append("■$body\n")
        buffer.append("\n")
    }

    override fun makeItems(items: List<String>) {
        items.forEach { buffer.append(it) }
        buffer.append("\n")
    }

    override fun close() {
        buffer.append("======================\n")
    }


}