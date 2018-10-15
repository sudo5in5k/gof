package com.example.sho.gof.observer

/**
 * イベント Subject
 *
 * Created by sho on 2018/10/08.
 */
abstract class Events {

    private val observers = ArrayList<Observer>()
    var number = 0

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun notifyObservers() {
        val iterator: MutableIterator<Observer> = observers.iterator()
        while (iterator.hasNext()) run {
            val observer: Observer = iterator.next()
            observer.inspect(this)
        }
    }

    abstract fun execute()
}