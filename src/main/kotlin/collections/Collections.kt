package collections

import kotlin.Result

class Bitmap
class Result<T : Any>(val result: T?, val t: Throwable?)


class Box<T>(t: T) {
    var value = t

}

fun <T> List<T>.getByNumbers(vararg args: Int): List<T> {
    val result = mutableListOf<T>()
    for (i in args) {
        result.add(this[i])
    }
    return result
}

fun main() {
    val bitmap = Bitmap()
    val result = Result(bitmap, null)

    val throwable = Throwable()
    val error = Result<Bitmap>(null, throwable)
//    val one = listOf(1,2,3,)
//    println(one.getByNumbers())
//    val intBox = Box(1)
//    println(intBox.value)
//    val numberBox: Box<Number> = Box(2.33)
//    println(numberBox.value)


    val list = listOf(1, 2, 3, 4)
//    list[2] = 12
    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(13)

    val set = setOf("one", "two") //LinkedHashSet HashSet SortedSet
//    set[0] = "hhh"

    val map = mapOf("one" to 1, "two" to 2)  //LinkedMap HashMap SortedMap
}