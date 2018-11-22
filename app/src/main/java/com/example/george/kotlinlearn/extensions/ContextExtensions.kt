package com.example.george.kotlinlearn.extensions

import android.content.Context
import android.support.v4.content.ContextCompat

/**
 * Created By George
 * Description:
 */
fun Context.color(res:Int): Int = ContextCompat.getColor(this,res)