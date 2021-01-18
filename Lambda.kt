fun main(){
    //old way to do this
    //println(square(5))

    //has return type
    val square : (Int) -> Int = {number ->
        number * number
    }

    println(square(6))

    //has no return type
    val printName : (String) -> Unit = {
        println(it)
    }
    printName("Hello")

}
fun square(num:Int) = num*num