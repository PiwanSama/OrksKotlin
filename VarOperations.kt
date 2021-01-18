fun main(){

    var number = 50;
    var numberDouble = number.toDouble();
    var numberString = number.toString();
    //toByte
    //toChar, etc

    println(number);
    println(numberDouble);
    println(numberString); 

    var num1 = 10;
    var num2 = 5;

    var add = num1.plus(num2);
    var subtract = num1.minus(num2);
    var divide = num1.div(num2);
    var mutliply = num1.times(num2);
    var comp = num1.compareTo(num2);

    println(add);
    println(subtract);
    println(divide);
    println(mutliply);
    println(comp);

    var firstName = "Samalie";
    var lastName = "Piwan";

    var fullName = "$firstName $lastName";
    println(fullName);
    println(firstName.length);
    println(firstName[0]);
    println(firstName.toLowerCase());

    var lines = """
     I am on a new 
     line""";


}