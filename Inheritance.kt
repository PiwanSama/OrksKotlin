fun main() {
    val addition = Addition(2,3,5)
    println(addition.add())
} 

open class BaseAddition(val num1:Int, val num2:Int){
    open fun add() = num1 + num2
}

class Addition(val numberOne:Int, val numberTwo:Int, val numberThree:Int):BaseAddition(numberOne, numberTwo) {
    override fun add(): Int{
        return numberOne.plus(numberTwo).plus(numberThree)
    }
}
