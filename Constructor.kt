fun main(){
    val person = Person()
    println(person.userName)
}

//primary constructor
class Person(val age:Int, fName:String, lName:String){

    var myAge = age
    var userName = "$fName $lName"

    //Secondary Constructor
    constructor(fullName:String = "Your Name"):this(0, fullName, ""){
        userName = fullName
    }

    //You can create multiple secondary constructors

}