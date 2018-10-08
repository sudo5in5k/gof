package com.example.sho.gof.state

/**
 * 状態の管理を行うインターフェース
 *
 * Created by sho on 2018/10/05.
 */
interface Contexer {
    fun setClock(hour: Int)
    fun changeState(state: State)
    fun callSecurity(msg: String)
    fun recordLog(msg: String)
}
