package com.brunocollingridge.kotlinbot.util.logging

import java.io.OutputStream
import java.io.PrintStream
import java.util.regex.Pattern

/**
 * This class hides certain messages from being displayed in the console.
 */
class OutputFilter(out: OutputStream) : PrintStream(out) {

    /**
     * Javacord's logging warning - we want to hide this.
     */
    private val javacordLogErrorPattern = Pattern.compile(".* INFO org.javacord.core.util.logging.ExceptionLoggerDelegateImpl No Log4j2 compatible logger was found. Using default Javacord implementation!")


    /**
     * This method tells the console not to print Javacord's logging warning.
     *
     * @param x The message the console wants to print.
     */
    override fun println(x: String) {
        if (javacordLogErrorPattern.matcher(x).matches()) {
            return
        }

        super.println(x)
    }

}