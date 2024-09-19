open class FirstTask(val numberArr: IntArray){
    fun sum(): Int{
        var resultNumber:Int = 0;
        numberArr.forEach {
            if (it > 0) {
                resultNumber += it;
            }
        }
        return resultNumber;
    }

    fun multiplication(): Int{
        var resultNumber:Int = 1;
        numberArr.forEach {
            resultNumber *= it;
        }
        return resultNumber;
    }

    fun average(): Int{
        var resultNumber:Int = 1;
        numberArr.forEach {
            resultNumber += it;
        }
        resultNumber /= numberArr.size;
        return resultNumber;
    }
}

open class SecondTask(numberArr: IntArray) : FirstTask(numberArr){
    fun increased(): IntArray{
        val resultArr: IntArray = IntArray(numberArr.size);
        for(i in numberArr.indices){
            resultArr[i] = numberArr[i];
            if (resultArr[i] % 2 == 0){
                resultArr[i] *= 2;
            }
        }
        return resultArr;
    }

    fun max(): Int{
        var max: Int = numberArr[0];
        numberArr.forEach {
            if (it > max){
                max = it
            }
        }
        return max;
    }

    fun min(): Int{
        var min: Int = numberArr[0];
        numberArr.forEach {
            if (it < min){
                min = it
            }
        }
        return min;
    }
}

class Vector(val coordinates: List<Double>){
    var x = coordinates[0];
    var y = coordinates[1];
    var z = coordinates[2];

    fun vectorLength(): Double{
        return Math.sqrt(x * x + y * y + z * z);
    }

    fun firstScalar(enemyVector: Vector) : Double{
        return x * enemyVector.x + y * enemyVector.y + z * enemyVector.z;
    }

    infix fun infixScalar(enemyVector: Vector){
        println(x * enemyVector.x + y * enemyVector.y + z * enemyVector.z);
    }

    operator fun times(enemyVector: Vector): Double{
        return x * enemyVector.x + y * enemyVector.y + z * enemyVector.z;
    }
}

fun scalar(firstVector: Vector, secondVector: Vector): Double{
    return firstVector * secondVector;
}

fun main() {
}