fun numberToWords(number: Int): String {
    if (number !in 0..100) {
        return "Число должно быть в диапазоне от 0 до 100"
    }

    val ones = listOf("ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")
    val teens = listOf("десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать")
    val tens = listOf("", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")

    return when {
        number < 10 -> ones[number]
        number < 20 -> teens[number - 10]
        else -> {
            val tensDigit = number / 10
            val onesDigit = number % 10
            "${tens[tensDigit]} ${ones[onesDigit]}".trim()
        }
    }
}

fun main() {
    val numbers1 = listOf(-2, 3, -5, 7, -1)

    val negativeNumbers = numbers1.filter { it < 0 }
    println(negativeNumbers)

    val modifiedNumbers = numbers1.map { if (it > 0) -it else it }
    println(modifiedNumbers)

    val numbers2 = listOf(1, 2, 3, 4, 5)
    val squares = numbers2.map { it * it }
    println(squares)

    val numbers = (1..7).toList()
    val string = numbers.joinToString("+")
    println("=$string=")

    val phoneBook = mapOf("Alice" to "+1234567890", "Bob" to "+7987654321", "Charlie" to "+4912345678")
    val countryCode = "+7"
    val filteredContacts = phoneBook.filterValues { it.startsWith(countryCode) }
    println(filteredContacts)

    val timeString = "01:20:12"
    val timeParts = timeString.split(":").map { it.toInt() }
    val totalSeconds = timeParts[0] * 3600 + timeParts[1] * 60 + timeParts[2]
    println("Количество секунд: $totalSeconds")

    // очень сложное задание
}