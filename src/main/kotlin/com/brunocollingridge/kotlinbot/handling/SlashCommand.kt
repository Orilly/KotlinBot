package com.brunocollingridge.kotlinbot.handling

import com.brunocollingridge.kotlinbot.annotations.Description
import com.brunocollingridge.kotlinbot.annotations.Identifier
import com.brunocollingridge.kotlinbot.util.exceptions.CommandNameException
import org.javacord.api.event.interaction.SlashCommandCreateEvent
import org.javacord.api.interaction.SlashCommandInteraction

/**
 * A slash command.
 */
interface SlashCommand {

    /**
     * The name of the slash command.
     */
    fun getName(): String {
        if (javaClass.isAnnotationPresent(Identifier::class.java)) {
            return javaClass.getAnnotation(Identifier::class.java).value
        } else {
            throw CommandNameException("All commands must have a name to be identified by!")
        }
    }

    /**
     * The description of the slash command.
     */
    fun getDescription(): String {
        return if (javaClass.isAnnotationPresent(Description::class.java)) {
            javaClass.getAnnotation(Description::class.java).value
        } else {
            "No description set."
        }
    }

    /**
     * Executes the slash command.
     *
     * @param event The SlashCommandCreateEvent of the slash command.
     * @param interaction The SlashCommandInteraction of the slash command.
     */
    fun execute(event: SlashCommandCreateEvent, interaction: SlashCommandInteraction)

}