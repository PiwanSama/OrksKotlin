fun main(){
    val list:List<Int> = mutableListOf(5,6,7,8,11,13)
    val eList = emptyList<Int>()

    val evenList = list.filter{
        it%2 == 0
    }
    println(evenList)

    val addedOneList = list.map{
        it+1
    }
    println(addedOneList)

    val evenListTwo = list.filterNot{
        it%2 != 0
    }
    println(evenListTwo)

    //or list.subList(0,3) //mutable list
    val slicedList = list.slice(0..3) //list
    println(slicedList)
    
    val takenList = list.take(3)
    println(takenList)

    val lastList = list.takeLast(3)
    println(lastList)

    println(list.elementAtOrNull(8))
    println(list.isEmpty())
    println(eList.isEmpty())
}