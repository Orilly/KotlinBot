package com.brunocollingridge.kotlinbot.handling

import com.brunocollingridge.kotlinbot.commands.Kotlin
import com.brunocollingridge.kotlinbot.commands.Ping
import org.javacord.api.event.interaction.SlashCommandCreateEvent
import org.javacord.api.listener.interaction.SlashCommandCreateListener

/**
 * Handles all slash commands.
 */
class CommandHandler : SlashCommandCreateListener {

    /**
     * An ArrayList of all registered slash commands.
     */
    private val commands = arrayOf(
        Ping(),
        Kotlin()
    )

    /**
     * Handles an incoming slash commands.
     *
     * @param event The SlashCommandCreateEvent of the command.
     */
    override fun onSlashCommandCreate(event: SlashCommandCreateEvent) {
        val interaction = event.slashCommandInteraction

        for (command in commands) {
            if (command.getName() == interaction.commandName) {
                command.execute(event, interaction)
            }
        }
    }

}