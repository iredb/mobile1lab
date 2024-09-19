open class Vehicle(open val speed: Int = 0, open val name: String = "Транспортное средство") {
    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановился")
    }
}

class Boat(override val speed: Int = 10, override val name: String = "Лодка") : Vehicle()

class Airplane(override val speed: Int = 900, override val name: String = "Самолет") : Vehicle()

class Tank(override val speed: Int = 40, override val name: String = "Танк") : Vehicle()

fun main() {
    val boat = Boat()
    val airplane = Airplane()
    val tank = Tank()

    boat.start()
    airplane.start()
    tank.start()

    boat.stop()
    airplane.stop()
    tank.stop()
}