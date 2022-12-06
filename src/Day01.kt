fun main() {
    val input = readInput("Day01")
    val elves = mutableListOf<Int>()
    var sum = 0
    input.forEach() {
        if (it.isNotEmpty()) sum += it.toInt()
        else {
            elves.add(sum)
            sum = 0
        }
    }
    println(elves.sortedDescending().take(3).sum())
}
