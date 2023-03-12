fun heap_add(heap: ArrayList<Int>, key: Int) {
    val index = heap.size + 1
    heap[index] = key
    sift_up(heap, index)
}

fun sift_up(heap: ArrayList<Int>, index: Int) {
    if (index == 1) return

    val parentIndex = index / 2
    if (heap[parentIndex] < heap[index]) {
        val temp = heap[parentIndex]
        heap[parentIndex] = heap[index]
        heap[index] = temp
        sift_up(heap, parentIndex)
    }
}
