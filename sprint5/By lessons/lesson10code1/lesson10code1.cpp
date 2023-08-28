#include <vector>

void sift_up(std::vector<int>& heap, int index) {
    if (index == 1) return;

    int parentIndex = index / 2;
    if (heap[parentIndex - 1] < heap[index - 1]) {
        std::swap(heap[parentIndex - 1], heap[index - 1]);
        sift_up(heap, parentIndex);
    }
}

void heap_add(std::vector<int>& heap, int key) {
    int index = heap.size() + 1;
    heap.push_back(key);
    sift_up(heap, index);
}
