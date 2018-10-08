package com.example.sho.gof.state

/**
 * 金庫の状態を表すインターフェース
 *
 * Created by sho on 2018/10/05.
 */
interface State {
    fun clock(context: Contexer, hour: Int)
    fun use(context: Contexer)
    fun alarm(context: Contexer)
    fun phone(context: Contexer)
}