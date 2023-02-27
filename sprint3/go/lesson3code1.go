func binarySearch(arr []int, x int, left int, right int) int {
    if right <= left {
        // промежуток пуст
        return -1
    }
    // промежуток не пуст
    mid := (left + right) / 2
    if arr[mid] == x {
        // центральный элемент — искомый
        return mid
    } else if x < arr[mid] {
        // искомый элемент меньше центрального значит следует искать в левой половине
        return binarySearch(arr, x, left, mid)
    } else {
        // иначе следует искать в правой половине
        return binarySearch(arr, x, mid+1, right)
    }
}

// изначально мы запускаем двоичный поиск на всей длине массива
index := binarySearch(arr, x, 0, len(arr))
