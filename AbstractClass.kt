fun main() {
    val windows =  Windows()
    val mac =  Mac()

    getOperatingSystem(windows)
    getOperatingSystem(mac)
} 

fun getOperatingSystem(computer:Computer) = println(computer.operatingSystem())

abstract class Computer(){
    abstract fun operatingSystem():String
}

class Windows():Computer(){
    override fun operatingSystem():String{
        return "Windows"
    }
}

class Mac():Computer(){
    override fun operatingSystem():String{
        return "Mac"
    }
}