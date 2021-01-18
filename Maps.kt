fun main(){
    
    //maps are key-value pairs

    val ageMapper = mapOf("Kiks" to 36, "Kai" to 18)
    
    println(ageMapper)
    println(ageMapper["Samalie"])
    //size() or count() for size of map

    println(ageMapper.count({
        it.value > 28
    }))

    val newAgeMapper = mutableMapOf("Kiks" to 36, "Kai" to 18)
    newAgeMapper.put("Kanga", 50)
    println(newAgeMapper)

    // clear a map with newAgeMapper.clear()
    println(newAgeMapper.contains("Kai"))
    println(newAgeMapper.contains(12))

    println(newAgeMapper.filter{
        it.key == "Kai" || it.value = 36
        // or just it == "36" to check everything for everything
    })

    println(newAgeMapper.toSortedMap())

    //get this value or return the default
    println(newAgeMapper.getOrDefault("Undefined", -1))

    //filterNot
    println(newAgeMapper.keys())
    println(newAgeMapper.values())
}