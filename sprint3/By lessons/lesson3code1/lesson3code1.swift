func binarySearch(arr: [Int], x: Int, left: Int, right: Int) -> Int {
    if right <= left { // промежуток пуст
        return -1
    }
    
    // промежуток не пуст
    let mid = (left + right) / 2
    if arr[mid] == x { // центральный элемент — искомый
        return mid
    } else if x < arr[mid] { // искомый элемент меньше центрального, ищем в левой половине
        return binarySearch(arr: arr, x: x, left: left, right: mid)
    } else { // иначе ищем в правой половине
        return binarySearch(arr: arr, x: x, left: mid + 1, right: right)
    }
}

let arr = [1, 3, 5, 7, 9, 11, 13, 15]
let x = 7
let index = binarySearch(arr: arr, x: x, left: 0, right: arr.count)
print(index) // Вывод: 3 (индекс элемента 7)
