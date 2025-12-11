package me.siv.tooltipscreenshot

import com.mojang.brigadier.CommandDispatcher
import com.teamresourceful.resourcefulconfig.api.loader.Configurator
import com.teamresourceful.resourcefulconfig.api.types.ResourcefulConfig
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource
import net.minecraft.commands.CommandBuildContext

object TooltipScreenshot : ClientModInitializer {

    val configurator = Configurator("tooltipscreenshot")
    var config: ResourcefulConfig? = null

    override fun onInitializeClient() {
        config = Config.register(configurator)
        ClientCommandRegistrationCallback.EVENT.register(::onRegisterCommands)
    }

    private fun onRegisterCommands(
        dispatcher: CommandDispatcher<FabricClientCommandSource>,
        buildContext: CommandBuildContext
    ) {
        dispatcher.register(
            ClientCommandManager.literal("meow").executes { context ->
                println("Hello, world!")
                1
            })
    }
}