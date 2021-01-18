 fun main(){
     val userOne = User("Sama", 12)
     //print the second paramter
     println(userOne.component2())

    val userTwo = userOne.copy(age = 13)
    println(userTwo.age)

    //Destructure data class
    val(uName, age) = userTwo
    println(uName)
    println(age)
 }

data class User(val userName:String, val age:Int){
 //same as a data model
}