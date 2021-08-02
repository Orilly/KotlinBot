package com.brunocollingridge.kotlinbot.commands

import com.brunocollingridge.kotlinbot.annotations.Description
import com.brunocollingridge.kotlinbot.annotations.Identifier
import com.brunocollingridge.kotlinbot.handling.SlashCommand
import org.javacord.api.entity.message.MessageFlag
import org.javacord.api.entity.message.component.ActionRow
import org.javacord.api.entity.message.component.Button
import org.javacord.api.event.interaction.SlashCommandCreateEvent
import org.javacord.api.interaction.SlashCommandInteraction

/**
 * This command explains what Kotlin is, and links the official website.
 */
@Identifier("kotlin")
@Description("What is Kotlin?")
class Kotlin : SlashCommand {

    override fun execute(event: SlashCommandCreateEvent, interaction: SlashCommandInteraction) {
        val info = "Kotlin is a modern, concise and safe programming language, developed by JetBrains and open-source contributors."
        val link = "https://kotlinlang.org/"

        interaction.createImmediateResponder()
            .setContent(info)
            .addComponents(ActionRow.of(Button.link(link, "Website")))
            .setFlags(MessageFlag.EPHEMERAL)
            .respond()
    }

}