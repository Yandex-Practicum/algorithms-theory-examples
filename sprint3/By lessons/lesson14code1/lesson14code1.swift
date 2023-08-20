func countingSort(_ array: inout [Int], _ k: Int) -> [Int] {
    var countedValues = Array(repeating: 0, count: k)
    
    for value in array {
        countedValues[value] += 1
    }
    
    var index = 0
    for value in 0..<k {
        for _ in 0..<countedValues[value] {
            array[index] = value
            index += 1
        }
    }
    
    return array
}

var unsortedArray = [11, 2, 9, 7, 1]
let maxValue = unsortedArray.max()! + 1
let sortedArray = countingSort(&unsortedArray, maxValue)
print(sortedArray)