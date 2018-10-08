package com.example.sho.gof.observer

/**
 * 数を生成する抽象クラス
 *
 * Created by sho on 2018/10/08.
 */
abstract class NumberGenerator {

    private val observers = ArrayList<Observer>()
    var number = 0

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun deleteObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers() {
        val iterator: MutableIterator<Observer> = observers.iterator()
        while (iterator.hasNext()) run {
            val observer: Observer = iterator.next()
            observer.update(this)
        }
    }

    open fun execute() {
    }
}