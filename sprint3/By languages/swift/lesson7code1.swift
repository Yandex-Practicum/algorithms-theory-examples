func insertionSort(_ array: inout [Int]) {
    for i in 1..<array.count {
        let itemToInsert = array[i]
        var j = i
        while j > 0 && itemToInsert < array[j - 1] {
            array[j] = array[j - 1]
            j -= 1
        }
        array[j] = itemToInsert
        print("step \(i), sorted \(i + 1) elements: \(array)")
    }
}

var array = [11, 2, 9, 7, 1]
insertionSort(&array)
// step 1, sorted 2 elements: [2, 11, 9, 7, 1]
// step 2, sorted 3 elements: [2, 9, 11, 7, 1]
// step 3, sorted 4 elements: [2, 7, 9, 11, 1]
// step 4, sorted 5 elements: [1, 2, 7, 9, 11]