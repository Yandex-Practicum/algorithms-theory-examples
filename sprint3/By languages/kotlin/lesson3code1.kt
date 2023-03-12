fun binarySearch(arr: IntArray, x: Int, left: Int, right: Int): Int {
    if (right <= left) { // промежуток пуст
        return -1
    }
    // промежуток не пуст
    val mid = (left + right) / 2
    if (arr[mid] == x) { // центральный элемент — искомый
        return mid
    } else if (x < arr[mid]) { // искомый элемент меньше центрального
        // значит следует искать в левой половине
        return binarySearch(arr, x, left, mid)
    } else { // иначе следует искать в правой половине
        return binarySearch(arr, x, mid + 1, right)
    }
}

// изначально мы запускаем двоичный поиск на всей длине массива
val index = binarySearch(arr, x, left = 0, right = arr.size)