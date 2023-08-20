func mergeSort(_ array: [Int]) -> [Int] {
    guard array.count > 1 else {
        return array
    }
    
    let middle = array.count / 2
    // запускаем сортировку рекурсивно на левой половине
    let leftArray = mergeSort(Array(array[..<middle]))
    // запускаем сортировку рекурсивно на правой половине
    let rightArray = mergeSort(Array(array[middle...]))
    
    return merge(leftArray, rightArray)
}

func merge(_ left: [Int], _ right: [Int]) -> [Int] {
    var mergedArray: [Int] = []
    var l = 0
    var r = 0
    
    while l < left.count && r < right.count {
        if left[l] < right[r] {
            mergedArray.append(left[l])
            l += 1
        } else {
            mergedArray.append(right[r])
            r += 1
        }
    }
    
    mergedArray.append(contentsOf: left[l...])
    mergedArray.append(contentsOf: right[r...])
    
    return mergedArray
}

let unsortedArray = [11, 2, 9, 7, 1]
let sortedArray = mergeSort(unsortedArray)
print(sortedArray)