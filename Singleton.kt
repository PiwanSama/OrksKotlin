fun main(){
    println(UserProfile.add(1,3))
    println(UserProfile.add(10,3))
}

//has no consructor
//cannot be instantiated
object UserProfile{
    fun add(num1:Int, num2:Int) = num1.plus(num2)
}