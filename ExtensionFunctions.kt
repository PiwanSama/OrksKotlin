fun main(){
    val numberOne = 30
    numberOne.arithmetic(20)

    val name = "Ali"
    name.midValue()
}

fun Int.arithmetic(number:Int){
    println("Addition is ${this+number}")
    println("Subtraction is ${this-number}")
    println("Multiplication is ${this*number}")
}

fun String.midValue(){
    if(this.length%2 == 0){
        println("No mid value")
    }else{
        println(this[this.length%2])
    }
}
