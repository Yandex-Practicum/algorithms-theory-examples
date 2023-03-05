fun solve(array: List<Int>): Int {
    var maximalSum = 0
    for (i in 0 until array.size) {
        val currentSum = array.subList(0, i + 1).sum()
        if (maximalSum < currentSum) {
            maximalSum = currentSum
        }
    }
    return maximalSum
}
