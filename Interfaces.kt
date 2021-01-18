fun main(){
    val windows = Windows()
    println(windows.operatingSystem())
}

interface Computer{
    fun operatingSystem():String
    fun buildYear():Int
    fun buildBy() = "ABC"
}

class Windows(): Computer {
    override fun operatingSystem():String{
        return "Windows"
    }
    override fun buildYear():Int{
        return 2001
    }
}