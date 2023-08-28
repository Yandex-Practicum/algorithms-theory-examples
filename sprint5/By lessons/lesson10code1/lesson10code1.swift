import Foundation

func heapAdd(_ heap: inout [Int], _ key: Int) {
    let index = heap.count + 1
    heap.insert(key, at: index - 1)
    siftUp(&heap, index)
}

func siftUp(_ heap: inout [Int], _ index: Int) {
    if index == 1 { return }

    let parentIndex = index / 2
    if heap[parentIndex - 1] < heap[index - 1] {
        heap.swapAt(parentIndex - 1, index - 1)
        siftUp(&heap, parentIndex)
    }
}

var heap = [Int]()
heapAdd(&heap, 5)
heapAdd(&heap, 8)
heapAdd(&heap, 3)
print(heap) // Output: [8, 5, 3]
