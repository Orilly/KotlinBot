package com.brunocollingridge.kotlinbot

import io.github.cdimascio.dotenv.Dotenv

/**
 * Gets information from the .env file.
 */
object Env {
    private val ENV: Dotenv = Dotenv.load()
    val TOKEN: String = ENV.get("TOKEN")
}