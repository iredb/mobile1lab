class Car(name: String, speed: Int);
data class Vehicle(val name: String, val speed: Int);

data class Point(var x: Int, var y: Int) {
    override fun toString(): String {
        return "Текущие координаты: x = $x, y = $y"
    }
}
enum class Command {
    UP, DOWN, LEFT, RIGHT
}
class Turtle {
    fun move(point: Point, command: Command) {
        when (command) {
            Command.UP -> point.y++
            Command.DOWN -> point.y--
            Command.LEFT -> point.x--
            Command.RIGHT -> point.x++
        }
        println("Произведено перемещение: $point")
    }
}

fun main() {
    var car1 = Car("Lada",100);
    var car2 = Car("lada", 100);
    val car3 = car1

    println("car1 == car2: ${car1 == car2}");
    println("car1 === car2: ${car1 === car2}");
    println("car1.hashCode() == car2.hashCode(): ${car1.hashCode() == car2.hashCode()}");

    println("car1 == car3: ${car1 == car3}");
    println("car1 === car3: ${car1 === car3}");
    println("car1.hashCode() == car3.hashCode(): ${car1.hashCode() == car3.hashCode()}");

    car3.name = "Belaz";
    println("car1.name: ${car1.name}");
    println("car3.name: ${car3.name}");

    val vehicle1 = Vehicle("Ural", 100);
    val vehicle2 = Vehicle("Ural", 100);
    val vehicle3 = vehicle1.copy("ZIL");
    val vehicle4 = vehicle1.copy();

    println("vehicle1 == vehicle2: ${vehicle1 == vehicle2}");
    println("vehicle1 === vehicle2: ${vehicle1 === vehicle2}");
    println("vehicle1.hashCode() == vehicle2.hashCode(): ${vehicle1.hashCode() == vehicle2.hashCode()}");

    println("vehicle1 == vehicle3: ${vehicle1 == vehicle3}");
    println("vehicle1 === vehicle3: ${vehicle1 === vehicle3}");
    println("vehicle1.hashCode() == vehicle3.hashCode(): ${vehicle1.hashCode() == vehicle3.hashCode()}");

    println("vehicle1 == vehicle4: ${vehicle1 == vehicle4}");
    println("vehicle1 === vehicle4: ${vehicle1 === vehicle4}");
    println("vehicle1.hashCode() == vehicle4.hashCode(): ${vehicle1.hashCode() == vehicle4.hashCode()}");

    val point = Point(0, 0)
    val turtle = Turtle()

    turtle.move(point, Command.RIGHT)
    turtle.move(point, Command.UP)
    turtle.move(point, Command.LEFT)
    turtle.move(point, Command.DOWN)
}