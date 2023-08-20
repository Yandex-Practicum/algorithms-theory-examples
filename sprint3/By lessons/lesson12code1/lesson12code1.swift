func partition(_ array: [Int], _ pivot: Int) -> ([Int], [Int], [Int]) {
    let left = array.filter { $0 < pivot }
    let center = array.filter { $0 == pivot }
    let right = array.filter { $0 > pivot }
    return (left, center, right)
}

func quicksort(_ array: [Int]) -> [Int] {
    if array.count < 2 {
        return array
    } else {
        let pivot = array.randomElement()!
        let (left, center, right) = partition(array, pivot)
        return quicksort(left) + center + quicksort(right)
    }
}

let unsortedArray = [11, 2, 9, 7, 1]
let sortedArray = quicksort(unsortedArray)
print(sortedArray) 