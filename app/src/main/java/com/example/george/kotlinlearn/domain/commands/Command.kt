package com.example.george.kotlinlearn.domain.commands

/**
 * Created By George
 * Description:
 */
interface Command<out T> {
    fun execute():T
}