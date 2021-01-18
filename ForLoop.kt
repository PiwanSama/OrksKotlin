fun main(){
    val list = listOf("Kampala", "Mbarara", "Web")

    for (name in list){
        println(name)
    }

    for (index in list.indices){
        println(index)
        println(list[index])
    }

    //same as above
    for((index, value) in list.withIndex()){
        println(index)
        println(value)
    }

    for(number in 0..10){
    println(number)
}

//stops at 9
for(number in 0 until 10){
    println(number)
}

for(number in 0..10 step 5){
    println("Step $number")
}

for(number in 10 downTo 0 step 2){
    println(number)
}    
}