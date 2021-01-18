fun main(){
    val numbers = mutableListOf("one","two","three","four")

    numbers.map{it.length}.filter{it>3}.let{
        println(it)
    }

    val nullableString:String? = "My Nullable String"
    nullableString.let{
        println(it)
    }
}