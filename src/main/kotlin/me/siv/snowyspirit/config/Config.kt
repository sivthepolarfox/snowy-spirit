package me.siv.snowyspirit.config

import com.teamresourceful.resourcefulconfigkt.api.ConfigKt

object Config : ConfigKt("snowyspirit/config") {
    override val name = Literal("snowyspirit")

    init {
        separator {
            title = "Mrrow"
            description = "Mrrp"
        }
    }

    var alwaysSnowing by boolean(true) {
        this.translation = "config.snowyspirit.fun.alwaysSnow"
    }

    var noSnowBlocking by boolean(true) {
        this.translation = "config.snowyspirit.fun.noSnowBlocking"
    }

    var time by long(-1L) {
        this.translation = "config.snowyspirit.fun.time"
        this.range = -1L..24000L
    }
}