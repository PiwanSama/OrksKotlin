fun main(){
    Event<String>()
    Event(12)
}

class Event<T> (value:T? = null){
    init{
        if(value != null){
            println(value.toString().length)
        }else{
            println("Not Initialized")
        }
    }
}