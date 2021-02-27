//Merge different list into one.
fun <T> merge(vararg lists: List<T>): List<T> {
    return object : ArrayList<T>() {
        init {
            lists.forEach {
                addAll(it)
            }
        }
    }
}