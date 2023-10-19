import java.lang.Integer.sum

fun main() = aocDay(1) {
    part1test = 24000
    part2test = 45000

    part1 {
        inputLines.splitByEntry("").map {
            it.map {
                it.toInt()
            }.sum()
        }.maxOf { it }
    }


    part2 {
        inputLines.splitByEntry("").map {
            it.map {
                it.toInt()
            }.sum()
        }.sorted().takeLast(3).sum()
    }
}