fun main(){
    //println(sayHi())
    //println(greetings(name="John"))
    println(newGreetings())
}

//default params
fun sayHi(name: String = "Mike"):String {
    return "Hey $name"
}
//named params
fun greetings(language:String = "Hello", name:String="Friend"):String{
    return "$language $name"
}

//single expression params
fun newGreetings(language:String = "Hey", name:String="Friend"):String = "$language $name"