package main

import "fmt"

func popMax(heap []int) int {
	result := heap[0]
	heap[0] = heap[len(heap)-1]
	heap = heap[:len(heap)-1]
	siftDown(heap, 0)
	return result
}

func siftDown(heap []int, index int) {
	left := 2*index + 1
	right := 2*index + 2

	if len(heap) <= left {
		return
	}

	indexLargest := left
	if right < len(heap) && heap[left] < heap[right] {
		indexLargest = right
	}

	if heap[index] < heap[indexLargest] {
		heap[index], heap[indexLargest] = heap[indexLargest], heap[index]
		siftDown(heap, indexLargest)
	}
}

func main() {
	heap := []int{8, 5, 3}
	maxValue := popMax(heap)
	fmt.Println(maxValue) // Output: 8
	fmt.Println(heap)     // Output: [5 3]
}
