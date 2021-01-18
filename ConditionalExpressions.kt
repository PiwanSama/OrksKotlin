fun main(){
    var age = 10
    var type: String

    type = if(age<=20){
        "Kid"
    }else if(age>20&&age<50){
        "Adult"
    }else "Old"

    println(type)
}