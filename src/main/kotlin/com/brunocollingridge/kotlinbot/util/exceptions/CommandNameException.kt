package com.brunocollingridge.kotlinbot.util.exceptions

import java.security.InvalidParameterException

/**
 * This exception will be thrown if a command isn't created correctly.
 */
class CommandNameException(message: String) : InvalidParameterException(message)