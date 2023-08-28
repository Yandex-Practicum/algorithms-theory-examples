def pop_max(heap):
    result = heap[0]
    heap[0] = heap[len(heap) - 1]
    heap.pop()
    sift_down(heap, 0)
    return result

def sift_down(heap, index):
    left = 2 * index + 1
    right = 2 * index + 2

    if len(heap) <= left:
        return

    index_largest = right if right < len(heap) and heap[left] < heap[right] else left

    if heap[index] < heap[index_largest]:
        heap[index], heap[index_largest] = heap[index_largest], heap[index]
        sift_down(heap, index_largest)
