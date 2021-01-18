fun main(){
    val age = 30
    try{
        getAge(age)
    }
    catch(e:Exception){
        println(e)
    }
    finally{
        println("Thanks for coming")
    }

    println("Done")
}

fun getAge(age:Int){
    if(age<20){
        throw MyAgeException(age)
    }
}

class MyAgeException(age:Int) : Exception("$age is not valid")
