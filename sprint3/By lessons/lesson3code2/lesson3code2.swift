func binarySearchDescending(arr: [Int], x: Int, left: Int, right: Int) -> Int {
    if right <= left {
        return -1
    }
    
    // промежуток не пуст
    let mid = (left + right) / 2
    if arr[mid] == x { // центральный элемент — искомый
        return mid
    } else if arr[mid] < x { // искомый элемент больше центрального, ищем в левой половине
        return binarySearchDescending(arr: arr, x: x, left: left, right: mid)
    } else { // иначе ищем в правой половине
        return binarySearchDescending(arr: arr, x: x, left: mid + 1, right: right)
    }
}

let arr = [15, 13, 11, 9, 7, 5, 3, 1]
let x = 7
let index = binarySearchDescending(arr: arr, x: x, left: 0, right: arr.count)
print(index) // Вывод: 4 (индекс элемента 7)
