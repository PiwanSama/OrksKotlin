fun main(){
    val listOne = listOf(1,2,3)
    val listTwo:List<Int> = mutableListOf(4,5,6)
    
    
    listTwo.add(7)
    println(listTwo)

    listTwo.remove(7)
    println(listTwo)

    listTwo[1] = 10
    println(listTwo)

    println(listTwo.contains(10))

    println(listTwo[0])

    println(listTwo.first())

    println(listTwo.last())

    //returns first element that matches this criteria
    val element = listTwo.find{
        it%2 == 0
    }
    println(element)
}