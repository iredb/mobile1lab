import kotlin.math.min;
import kotlin.math.max;

fun task1() {
    print("How many? ");
    var count = readln().toInt();
    var tryNumber = 2;

    while (count != 0) {
        if (isPrime(tryNumber)) {
            println(tryNumber);
            --count;
        }
        ++tryNumber;
    }
}

fun task2() {
    val testArray = arrayOf(1, 4, 6, 1, 6, 3, 8, 0, 1, 4, 6, 3, 1);
    for(i in 1..(testArray.size - 2)) {
        if(testArray[i] > testArray[i + 1] && testArray[i] > testArray[i - 1]) {
            println(testArray[i]);
        }
    }

    var i:Int = 1;
    while(i < testArray.size - 1) {
        if(testArray[i] > testArray[i + 1] && testArray[i] > testArray[i - 1]) {
            println(testArray[i]);
        }
        ++i;
    }

    testArray.forEachIndexed { numberIndex, element ->
        if (numberIndex in 1 until testArray.size - 1 && element > testArray[numberIndex - 1] && element > testArray[numberIndex + 1]) {
            println(element)
        }
    }
}

fun task3() {
    val testArray = arrayOf(1, 4, 6, 1, 6, 3, 8, 0, 1, 4, 6, 3, 1);
    var minNumber:Int = testArray[0];
    var maxNumber:Int = testArray[0];
    var product:Int = 1;

    for(i in 0..testArray.size - 1) {
        minNumber = min(minNumber, testArray[i]);
        maxNumber = max(maxNumber, testArray[i]);
        product *= testArray[i];
    }

    println("min $minNumber, max $maxNumber, product $product");

    /*
    var i:Int = 0;
    while(i < testArray.size) {
        minNumber = min(minNumber, testArray[i]);
        maxNumber = max(maxNumber, testArray[i]);
        product *= testArray[i];
    }

    val reduceResult = array.reduce { result, element -> result * element }
    val minReduce = array.reduce { result, element -> min(result, element) }
    val maxReduce = array.reduce { result, element -> maxOf(result, element) }

    testArray.forEach {
        minNumber = min(it, minNumber);
        maxNumber = max(it, maxNumber);
        product *= it;
    }
    */
}

fun isPrime(num: Int): Boolean { //Решето эрастофена для слабых
    if (num <= 1) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}


fun main() {
    task1();
    task2();
    task3();
}