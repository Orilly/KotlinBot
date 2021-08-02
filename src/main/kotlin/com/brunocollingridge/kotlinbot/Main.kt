package com.brunocollingridge.kotlinbot

import com.brunocollingridge.kotlinbot.handling.CommandHandler
import com.brunocollingridge.kotlinbot.util.logging.OutputFilter
import org.javacord.api.DiscordApi
import org.javacord.api.DiscordApiBuilder
import org.javacord.api.entity.activity.ActivityType
import org.javacord.api.entity.intent.Intent
import org.javacord.api.util.logging.ExceptionLogger

/**
 * The entry point of our program.
 */
fun main() {
    System.setOut(OutputFilter(System.out))

    DiscordApiBuilder()
        .setToken(Env.TOKEN)
        .setAllIntentsExcept(Intent.GUILD_PRESENCES)
        .setWaitForServersOnStartup(true)
        .login().thenAccept{ api ->
            onConnectToDiscord(api)
        }.exceptionally(ExceptionLogger.get())
}

/**
 * Instructions for the program to execute once it has logged into Discord.
 *
 * @param api An instance of the DiscordApi object.
 */
fun onConnectToDiscord(api: DiscordApi) {
    api.intents.forEach { intent ->
        if (intent.isPrivileged) {
            println("${intent.name} was enabled.")
        }
    }

    api.globalSlashCommands.thenAccept{ commands ->
        commands.forEach { command ->
            println("The command '${command.name}' been registered. [${command.id}]")
        }
    }

    println("${api.yourself.discriminatedName} has logged into Discord.")

    api.updateActivity(ActivityType.PLAYING, "Kotlin")

    api.addSlashCommandCreateListener(CommandHandler())
}

