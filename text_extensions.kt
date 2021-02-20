package com.surkhojb.randomquizzie.extensions

import android.os.Build
import android.text.Html
import android.text.Html.FROM_HTML_MODE_LEGACY
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun String.fromHtml(): String = Html.fromHtml(this,FROM_HTML_MODE_LEGACY).toString()