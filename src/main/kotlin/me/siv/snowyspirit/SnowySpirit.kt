package me.siv.snowyspirit

import com.teamresourceful.resourcefulconfig.api.loader.Configurator
import com.teamresourceful.resourcefulconfig.api.types.ResourcefulConfig
import me.siv.snowyspirit.config.Config
import net.fabricmc.api.ClientModInitializer
import net.minecraft.client.Minecraft
import org.slf4j.Logger
import org.slf4j.LoggerFactory

const val MODID = "snowyspirit"

object SnowySpirit : ClientModInitializer, Logger by LoggerFactory.getLogger(MODID) {
    val mc: Minecraft = Minecraft.getInstance()

    val configurator = Configurator("snowyspirit")
    var config: ResourcefulConfig? = null

    override fun onInitializeClient() {
        config = Config.register(configurator)
    }
}