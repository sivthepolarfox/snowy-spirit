package me.siv.tooltipscreenshot

import com.teamresourceful.resourcefulconfigkt.api.ConfigKt

object Config : ConfigKt("tooltipscreenshot/config") {
    override val name = Literal("Meow")

    init {
        separator {
            title = "Mrrow"
            description = "Mrrp"
        }
    }
}