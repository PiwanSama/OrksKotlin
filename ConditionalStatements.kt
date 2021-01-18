fun main(){
    var age = 7;

    when(age){
        in 3..9 -> {
            println("Child")
        }
        in 12..20 -> {
            println("Teenage")
        }
        in 21..30->{
            println("Adult");
        }
    }
}