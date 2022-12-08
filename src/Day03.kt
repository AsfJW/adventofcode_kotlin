
fun main() {
    val input = readInput("Day03")
    val rucksacks = mutableMapOf<String, String>()

    fun part1(input: List<String>): Int {
        var counter = 0
        var items = ""
        // TODO: change map as it will fail on duplicate lines
        input.forEach() {
            rucksacks.put(it.take(it.length / 2), it.takeLast(it.length / 2)).toString()
        }
        rucksacks.forEach() {
          loop@  for (c in it.key) {
                if (c in it.value) {
                    items += c
                    break@loop
                }
            }
        }
        for (c in items) {
            if (c in 'a' .. 'z') counter += c.code - 96 else if (c in 'A' .. 'Z') counter += c.code - 38
        }
        return counter
    }

    fun part2(input: List<String>): Int {
        var counter = 0
        var items = ""
        val groups = input.chunked(3)
        groups.forEach() {
            loop@ for (c in it[0]) {
                if (c in it[1] && c in it[2]) {
                    items += c
                    break@loop
                }
            }
        }
        for (c in items) {
            if (c in 'a' .. 'z') counter += c.code - 96 else if (c in 'A' .. 'Z') counter += c.code - 38
        }

        return counter
    }

    println(part1(input))
    println(part2(input))
}