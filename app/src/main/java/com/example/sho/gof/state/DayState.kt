package com.example.sho.gof.state

/**
 * 昼間の状態を表すクラス
 *
 * Created by sho on 2018/10/05.
 */
class DayState : State {

    object Singleton {
        fun dayState() = DayState()
    }

    override fun clock(context: Contexer, hour: Int) {
        context.setClock(hour)
        if (hour !in 10..17) {
            context.changeState(NightState.Singleton.nightState())
        }
    }

    override fun use(context: Contexer) {
        context.recordLog("金庫仕様昼間")
    }

    override fun alarm(context: Contexer) {
        context.callSecurity("非常ベル昼間")
    }

    override fun phone(context: Contexer) {
        context.callSecurity("通常の通話昼間")
    }

    override fun toString(): String {
        return "[昼間]"
    }

}