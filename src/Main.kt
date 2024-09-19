fun main() {
    print("Enter first number: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return println("Incorrect number")

    print("Enter operation (+, -, *, /): ")
    val operator = readLine()

    print("Enter second number: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return println("Incorrect number")

    when (operator) {
        "+" -> println("$num1 + $num2 = ${num1 + num2}")
        "-" -> println("$num1 - $num2 = ${num1 - num2}")
        "*" -> println("$num1 * $num2 = ${num1 * num2}")
        "/" -> {
            if (num2 == 0.0) {
                println("Zero division error")
            } else {
                println("$num1 / $num2 = ${num1 / num2}")
            }
        }
        else -> println("Incorrect operation")
    }
    val words = listOf("Hello", null, "World", null, "Kotlin")

    // Использование оператора if
    println("Using if:")
    words.forEach { word ->
        if (word != null) {
            println(word.uppercase())
        }
    }

    words.forEach { word ->
        println(word?.uppercase())
    }

    words.forEach { word ->
        word?.let { println(it.uppercase()) }
    }

    words.forEach { word ->
        println(word?.uppercase() ?: "empty")
    }
}