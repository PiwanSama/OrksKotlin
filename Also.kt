fun main(){
    val numbers = mutableListOf("one","two","three","four","five")

    val finalResult = numbers
        .map{ it.length }
        .also{ println(it) }
        .filter{ it>3 }

    println(finalResult)
}