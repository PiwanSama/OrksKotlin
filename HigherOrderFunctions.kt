fun main(){
    val added = doAddition()
    println(added(1,2))

    printMyName{
        println("Sama")
    }

    printIt{
        println(it)
    }
}

fun doAddition():(Int, Int) -> Int {
    return ::addNumbers
}

fun addNumbers(numOne:Int, numTwo:Int) = numOne.plus(numTwo)

fun printMyName(printMe:()->Unit){
    printMe()
}

fun printIt(printMe:(String) -> Unit){
    println("Piwan")
}