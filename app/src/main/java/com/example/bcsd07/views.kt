package com.example.bcsd07

import android.content.Context

class views(
    var color: String?,
    var num: Int?,
    var alpha: String?

) {
    fun getImageId(context: Context): Int {
        return context.resources.getIdentifier(color, "drawable", context.packageName)
    }
}
