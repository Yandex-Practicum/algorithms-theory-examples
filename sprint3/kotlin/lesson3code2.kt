fun binarySearchDescending(arr: IntArray, x: Int, left: Int, right: Int): Int {
    if (right <= left) {
        return -1
    }
    val mid = (left + right) / 2
    return if (arr[mid] == x) {
        mid
    } else if (arr[mid] < x) { // искомый элемент больше центрального
        // на этот раз все элементы больше центрального
        // располагаются в левой половине
        binarySearchDescending(arr, x, left, mid)
    } else {
        binarySearchDescending(arr, x, mid + 1, right)
    }
}