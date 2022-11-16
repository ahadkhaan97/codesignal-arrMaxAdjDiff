

fun main() {
    print(solution(mutableListOf(10, 11, 13)))
}

fun solution(inputArray: MutableList<Int>): Int {
    var max = -1
    for (i in 0 until inputArray.size - 1) {
        val difference = inputArray[i] - inputArray[i + 1]
        if (Math.abs(difference) > max) {
            max = Math.abs(difference)
        }
    }
    return max
}
