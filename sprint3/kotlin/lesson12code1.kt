fun partition(array: List<Int>, pivot: Int): Triple<List<Int>, List<Int>, List<Int>> {
    val left = array.filter { it < pivot }
    val center = array.filter { it == pivot }
    val right = array.filter { it > pivot }
    return Triple(left, center, right)
}

fun quicksort(array: List<Int>): List<Int> {
    if (array.size < 2) {
        return array   // массивы с 0 или 1 элементами фактически отсортированы
    } else {
        val pivot = array.random()
        val (left, center, right) = partition(array, pivot)
        return quicksort(left) + center + quicksort(right)
    }
}
