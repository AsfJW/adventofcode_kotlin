
fun main() {
    val input = readInput("Day02")

    fun part1(input: List<String>): Int {
        var score = 0
        input.forEach() {
            when (it) {
                "A X" -> score += 4
                "A Y" -> score += 8
                "A Z" -> score += 3

                "B X" -> score += 1
                "B Y" -> score += 5
                "B Z" -> score += 9

                "C X" -> score += 7
                "C Y" -> score += 2
                "C Z" -> score += 6
            }
        }
        return score
    }

    fun part2(input: List<String>): Int {
        var score = 0
        input.forEach() {
            when (it[0]) {
                'A' -> when (it[2]) {
                    'X' -> score += 3
                    'Y' -> score += 4
                    'Z' -> score += 8
                }
                'B' -> when (it[2]) {
                    'X' -> score += 1
                    'Y' -> score += 5
                    'Z' -> score += 9
                }
                'C' -> when (it[2]) {
                    'X' -> score += 2
                    'Y' -> score += 6
                    'Z' -> score += 7
                }
            }
        }
        return score
    }

    println(part1(input))
    println(part2(input))
}