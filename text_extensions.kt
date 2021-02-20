
fun String.fromHtml(): String = Html.fromHtml(this,FROM_HTML_MODE_LEGACY).toString()