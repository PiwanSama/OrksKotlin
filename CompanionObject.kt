fun main(){

    val sum = Person.add(4,5)
    println(sum)
    
}

class Person() {

    companion object{
        fun add(num1:Int, num2:Int) = num1.plus(num2)
    }

}