class Person(val firstName:String, val lastName:String){
    var address:String = "Unknown"
    var phoneNumber:String = "Unknown"

    fun getInfo() = """
        First Name = $firstName
        Last Name = $lastName
        Address = $address
        Phone Number = $phoneNumber
    """
    override fun toString():String{
        return "$firstName $lastName $address $phoneNumber"
    }
}

fun main(){
    val person = Person("Samalie", "Piwan").apply{
        address = "Kampala"
        phoneNumber = "256"
        getInfo()
    }
    //returns just the object, doesn't execute any other functions etc
    println(person.toString())
}