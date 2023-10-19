fun main() = aocDay(2) {
    part1test = 15
    part2test = 12

    part1 {
        val pointMap = mapOf(
            "A X" to 4,
            "B X" to 1,
            "C X" to 7,

            "A Y" to 8,
            "B Y" to 5,
            "C Y" to 2,

            "A Z" to 9,
            "B Z" to 8,
            "C Z" to 7,
        )

        inputLines.map { pointMap[it]!! }.sum()
    }

    part2 {
        val pointMap = mapOf(
            "A X" to 3,
            "B X" to 1,
            "C X" to 2,

            "A Y" to 4,
            "B Y" to 5,
            "C Y" to 6,

            "A Z" to 8,
            "B Z" to 9,
            "C Z" to 7,
        )

        inputLines.map { pointMap[it]!! }.sum()
    }

}