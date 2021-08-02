package com.brunocollingridge.kotlinbot.commands

import com.brunocollingridge.kotlinbot.annotations.Description
import com.brunocollingridge.kotlinbot.annotations.Identifier
import com.brunocollingridge.kotlinbot.handling.SlashCommand
import org.javacord.api.event.interaction.SlashCommandCreateEvent
import org.javacord.api.interaction.SlashCommandInteraction

/**
 * This command responds with the word "Pong!".
 */
@Identifier("ping")
@Description("Pong!")
class Ping : SlashCommand {

    override fun execute(event: SlashCommandCreateEvent, interaction: SlashCommandInteraction) {
        interaction.createImmediateResponder()
            .setContent("Pong!")
            .respond()
    }

}