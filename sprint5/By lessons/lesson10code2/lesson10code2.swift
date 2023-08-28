func popMax(heap: inout [Int]) -> Int {
    let result = heap[0]
    heap[0] = heap[heap.count - 1]
    heap.removeLast()
    siftDown(heap: &heap, index: 0)
    return result
}

func siftDown(heap: inout [Int], index: Int) {
    let left = 2 * index + 1
    let right = 2 * index + 2

    if left >= heap.count {
        return
    }

    var indexLargest = left
    if right < heap.count && heap[left] < heap[right] {
        indexLargest = right
    }

    if heap[index] < heap[indexLargest] {
        heap.swapAt(index, indexLargest)
        siftDown(heap: &heap, index: indexLargest)
    }
}


var heap = [8, 5, 3]
let maxValue = popMax(heap: &heap)
print(maxValue) // Output: 8
print(heap)     // Output: [5, 3]
