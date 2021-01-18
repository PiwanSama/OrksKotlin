fun main(){
    val list = listOf("Kampala", "Mbarara", "Gulu")

    list.forEach{ name-> 
        println("$name city")
    }

    list.forEachIndexed{ index, name ->
        println("$name at $index")
    }
}