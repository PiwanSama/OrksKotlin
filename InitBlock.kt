fun main(){
    val person = Person("Kai",10)
}

class Person(name:String) {

    init{
        println("Init block called")
    }

    constructor(fullName:String, age:Int):this(fullName){
        println("Secondary constructor called")
    }
}