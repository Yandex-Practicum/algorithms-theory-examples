#include <iostream>
#include <vector>

void siftDown(std::vector<int>& heap, int index) {
    int left = 2 * index + 1;
    int right = 2 * index + 2;

    if (left >= heap.size()) {
        return;
    }

    int indexLargest = left;
    if (right < heap.size() && heap[left] < heap[right]) {
        indexLargest = right;
    }

    if (heap[index] < heap[indexLargest]) {
        std::swap(heap[index], heap[indexLargest]);
        siftDown(heap, indexLargest);
    }
}

int popMax(std::vector<int>& heap) {
    int result = heap[0];
    heap[0] = heap.back();
    heap.pop_back();
    siftDown(heap, 0);
    return result;
}

int main() {
    std::vector<int> heap = {8, 5, 3};
    int maxValue = popMax(heap);
    std::cout << maxValue << std::endl; // Output: 8
    for (int value : heap) {
        std::cout << value << " "; // Output: 5 3
    }
    return 0;
}
