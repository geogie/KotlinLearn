package com.example.george.kotlinlearn.extensions

import java.text.DateFormat
import java.util.*

/**
 * Created By George
 * Description:
 */
fun Long.toDateString(dateFormat: Int = DateFormat.MEDIUM): String {
    val df = DateFormat.getDateInstance(dateFormat, Locale.getDefault())
    return df.format(this)
}