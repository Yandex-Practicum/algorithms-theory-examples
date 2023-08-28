package main

import "fmt"

func siftUp(heap []int, index int) {
    if index == 1 {
        return
    }

    parentIndex := index / 2
    if heap[parentIndex-1] < heap[index-1] {
        heap[parentIndex-1], heap[index-1] = heap[index-1], heap[parentIndex-1]
        siftUp(heap, parentIndex)
    }
}

func heapAdd(heap []int, key int) {
    index := len(heap) + 1
    heap = append(heap, key)
    siftUp(heap, index)
}

func main() {
    heap := []int{}
    heapAdd(heap, 5)
    heapAdd(heap, 8)
    heapAdd(heap, 3)
    fmt.Println(heap) // Output: [8 5 3]
}
