package com.brunocollingridge.kotlinbot.annotations

/**
 * The description of a slash command.
 */
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS)
annotation class Description(val value: String)