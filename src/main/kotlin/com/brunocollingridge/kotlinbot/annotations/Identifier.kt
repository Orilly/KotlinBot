package com.brunocollingridge.kotlinbot.annotations

/**
 * The identifier (name) of a slash command.
 */
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS)
annotation class Identifier(val value: String)