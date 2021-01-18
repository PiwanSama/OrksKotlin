class Person(val firstName:String, val lastName:String){
    var address:String = "Unknown"

    fun getInfo() = """
        First Name = $firstName
        Last Name = $lastName
        Address = $address
    """
}

fun main(){
    val person = Person("Samalie", "Piwan").run{
        address = "XYZ"
        getInfo()
    }
    println(person)
}