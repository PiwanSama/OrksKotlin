fun main(){
    val person = Person()

    println(person.age)

    person.age = 12

    println(person.age)

    person.myAge(30)

    println(person.age)
}

class Person{
//properties
//functions

    var age = 0

    fun myAge(myAge:Int){
        age = myAge 
    }
}