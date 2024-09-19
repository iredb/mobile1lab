fun sqr(a: Double): Double {
    return a * a;
}

fun discriminant(a: Double, b: Double, c: Double): Double {
    return b * b - 4 * a * c
}

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val disc = discriminant(a, b, c)

    return when {
        disc > 0 -> 2
        disc == 0.0 -> 1
        else -> 0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val disc = discriminant(a, b, c)

    when (rootsNumber(a, b, c)) {
        2 -> {
            val root1 = (-b + sqr(disc)) / (2 * a)
            val root2 = (-b - sqr(disc)) / (2 * a)
            println("x1 = $root1, x2 = $root2")
        }

        1 -> {
            val root = -b / (2 * a)
            println("x = $root")
        }

        0 -> {
            println("no one x.")
        }
    }
}

fun main() {
    print("a = ");
    val a = readln().toDouble();
    print("b = ");
    val b = readln().toDouble();
    print("c = ");
    val c = readln().toDouble();

    quadraticRoot(a, b, c);
}

