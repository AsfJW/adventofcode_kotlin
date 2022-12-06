fun main() {
    val input = readInput("Day01")
    var max: Int = Int.MIN_VALUE
    val elves = mutableListOf<Int>()
    var sum = 0

    fun part1(input: List<String>): Int {
        input.forEach() {
            if (it.isNotEmpty()) sum += it.toInt()
            else {
                if (sum > max) max = sum
                sum = 0
            }
        }
        return max
    }

    fun part2(input: List<String>): Int {
        input.forEach() {
            if (it.isNotEmpty()) sum += it.toInt()
            else {
                elves.add(sum)
                sum = 0
            }
        }
        return elves.sortedDescending().take(3).sum()
    }
    println(part1(input))
    println(part2(input))
}
