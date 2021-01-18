fun main(){
    val pair = Pair<String, Int>("Kai",2)

    //Destructuring a pair
    val(fName, age) = Pair("Kanga", 7)

    println(pair)
    println(fName)
    println(age)

    //val list = pair.toList()

    val triple = Triple("Samalie","Piwan", 12)
    val(fName, lName, age) = Triple("Kanga","Demu", 24)

    println(fName)
}