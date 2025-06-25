package com.caramm.textextractor.common.utils

import android.content.res.Resources

fun getWidth(resources: Resources): Float {
    val metrics = resources.displayMetrics
    return metrics.widthPixels / metrics.density
}

fun getHeight(resources: Resources): Float {
    val metrics = resources.displayMetrics
    return metrics.heightPixels / metrics.density
}
