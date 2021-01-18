sealed class Employee

data class Manager(val name:String, val age:Int, team:List<String>) : Employee
class SeniorDev(val name:String, val age:Int, val projects:Int)
object JuniorDev:Employee