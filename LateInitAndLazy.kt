fun main(){
    //creates object and allocates memory
    //val user = UserDetail("Sama", 12)

    //by lazy does not
    val user: UserDetail by lazy { UserDetail("Sama", 12) }
    println(user.toString())
}

class Declaration {
    //remains null safe
    lateinit var myName:String

    fun setValue(name:String){
        myName = name
    }

    fun getValue() = if(::myName.isInitialized) myName else "Not initialized"
}

class UserDetail(name:String, age:Int){
    init{
        println("The name is $name")
        println("The age is $age")
    }
}