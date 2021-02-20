
fun Activity.navigateTo(destination: KClass<MainActivity>, withExtras: Bundle? = null){
    val intent = Intent(this,destination.java)
    withExtras?.apply {
        intent.putExtras(this)
    }

    startActivity(intent)
}

fun Activity.showError(targetView: View,messageResource: Int) {
    createSnackBar(targetView,messageResource).show()
}

fun Activity.showErrorWithAction(targetView: View,messageResource: Int,
                                 actionResource: Int,
                                 action: () -> Unit?){
    createSnackBar(targetView,messageResource).apply {
        this.setActionTextColor(Color.WHITE)
        this.setAction(getString(actionResource)){action()}
    }.show()
}

fun Activity.showSuccessWithAction(targetView: View,messageResource: Int,
                                 actionResource: Int,
                                 action: () -> Unit?){
    createSnackBar(targetView,messageResource,R.color.successColorBackground).apply {
        this.setActionTextColor(Color.WHITE)
        this.setAction(getString(actionResource)){action()}
    }.show()
}

private fun createSnackBar(targetView: View, messageResource: Int, color: Int = R.color.errorColorBackground): Snackbar {
    return Snackbar.make(targetView,
        targetView.context.getString(messageResource),
        Snackbar.LENGTH_INDEFINITE)
        .apply {
            this.view.setBackgroundColor(
                ContextCompat.getColor(context,color))
        }
}