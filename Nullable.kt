fun main(){
    var name:String = "Samalie";

    //This line causes error because the variable name is not null
    name = null

    var fname: String? = "Samalie";

    //This works
    fname = null

    //Variable is nullable 
    var fullName: String? = "Samalie Piwan"

    //Print length if the variable isn't null
    println(fullName?.length)

    //THE ELVIS OPERATOR
    val length:Int? = fullName?.length ?: 0
    println(length)
}