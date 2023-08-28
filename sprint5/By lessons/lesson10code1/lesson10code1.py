def heap_add(heap, key):
    index = len(heap) + 1
    heap.append(key)
    sift_up(heap, index)

def sift_up(heap, index):
    if index == 1:
        return

    parentIndex = index // 2
    if heap[parentIndex - 1] < heap[index - 1]:
        heap[parentIndex - 1], heap[index - 1] = heap[index - 1], heap[parentIndex - 1]
        sift_up(heap, parentIndex)
