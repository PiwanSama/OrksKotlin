fun main(){
    val student = Student("Kai", StudentType.UNDERGRADUATE)

    for(type in StudentType.values()){
        println(type.name)
        println(type.ordinal)
    }
}

class Student(val name:String, type:StudentType){
    init{
        println("$name is ${type.typeVal}")
    }
}

enum class StudentType (val typeVal:String){
    UNDERGRADUATE("Undergraduate"),
    POSTGRADUATE("Postgraduate")
}