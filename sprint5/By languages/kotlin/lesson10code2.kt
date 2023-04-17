fun pop_max(heap: ArrayList<Int>): Int {
    val result = heap[0]
    heap[0] = heap[heap.size - 1]
    heap.removeAt(heap.size - 1)
    sift_down(heap, 0)
    return result
}

fun sift_down(heap: ArrayList<Int>, index: Int) {
    val left = 2 * index
    val right = 2 * index + 1

    // нет дочерних узлов    
    if (heap.size < left) {
        return
    }

    val index_largest: Int
    // right <= heap.size проверяет, что есть оба дочерних узла
    if (right <= heap.size && heap[left] < heap[right]) {
        index_largest = right
    } else {
        index_largest = left
    }

    if (heap[index] < heap[index_largest]) {
        val temp = heap[index]
        heap[index] = heap[index_largest]
        heap[index_largest] = temp
        sift_down(heap, index_largest)
    }
}