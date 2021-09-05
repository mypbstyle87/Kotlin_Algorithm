fun main() {
    val numbers = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    println(numbers.joinToString())
}