package com.example.sho.gof.state

/**
 * 夜間の状態クラス
 *
 * Created by sho on 2018/10/08.
 */
class NightState : State {

    object Singleton {
        fun nightState() = NightState()
    }

    override fun clock(context: Contexer, hour: Int) {
        if (hour in 10..17) {
            context.changeState(DayState.Singleton.dayState())
        }
    }

    override fun use(context: Contexer) {
        context.recordLog("金庫仕様夜間")
    }

    override fun alarm(context: Contexer) {
        context.callSecurity("非常ベル夜間")
    }

    override fun phone(context: Contexer) {
        context.recordLog("夜間の通話録音")
    }

    override fun toString(): String {
        return "[夜間]"
    }
}