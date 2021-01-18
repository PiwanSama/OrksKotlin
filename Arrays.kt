fun main() {
    
    val array:Array<Any> = arrayOf("Kai",2,3,4)
    //println(Arrays.toString(array))
    println(array[0]) 
    //or println(arrays.first())

    array[0] = "Kiks"
    //or array.set(0, "Kiks")

    //specify type at start e.g shortArray of, booleanArrayOf, etc
    val intArray = intArrayOf(1,2,36, 21, 8, 88) 

    var sumOfArray = intArray.sum()
    println(sumOfArray)
    println(intArray.max())
    println(intArray.min())
    println(intArray.count())
    val sortedArray = intArray.sortedArray()

    //Find numbers in array divisble by 0
    val number = array.find{
        it%2 == 0
    }

    println(number)

}