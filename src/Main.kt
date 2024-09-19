fun firstTask() {
    print("Print integer: ");
    val number:String? = readln();
    if (number != null){
        println("Sum of first and last digits of $number equals ${number.first().digitToInt() + number.last().digitToInt()}");
    }
}

fun secondTask() {
    var count = -1;
    var sum = -1;
    var number = 1;
    println("Enter numbers (0 to exit):");
    while (number != 0) {
        ++count;
        sum += number;
        number = readln().toInt();
    }
    if (count > 0) {
        println("Count: $count, sum: $sum, avg: ${sum/count}")
    };
}

fun thirdTask() {
    print("Guess the number from 1 to 10: ");
    val inGameNumber = (0..10).random();
    val userChoice = readLine();
    if (userChoice != null){
        if(userChoice.toInt() == inGameNumber){
            println("Guessed");
        }
        else if (userChoice.toInt() > inGameNumber){
            println("Too many");
        }
        else{
            println("Too little");
        }
    }
}

fun main() {
    firstTask();
    secondTask();
    thirdTask();
}