fun main() {
    val input = readInput("Day01")
    var max: Int = Int.MIN_VALUE
    var sum = 0
    input.forEach() {
        if (it.isNotEmpty()) sum += it.toInt()
        else {
            if (sum > max) max = sum
            sum = 0
        }
    }
    println(max)
}
