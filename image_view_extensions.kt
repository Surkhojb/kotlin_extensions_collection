
fun ViewGroup.inflate(layoutRes: Int): View {
    return LayoutInflater.from(this.context).inflate(layoutRes,this,false)
}

fun ImageView.loadUrl(url: String){
    Glide.with(this)
        .load(url)
        .into(this)
}