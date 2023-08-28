function siftUp(heap, index) {
    if (index === 1) {
        return;
    }

    const parentIndex = Math.floor(index / 2);
    if (heap[parentIndex - 1] < heap[index - 1]) {
        [heap[parentIndex - 1], heap[index - 1]] = [heap[index - 1], heap[parentIndex - 1]];
        siftUp(heap, parentIndex);
    }
}

function heapAdd(heap, key) {
    const index = heap.length + 1;
    heap.push(key);
    siftUp(heap, index);
}


const heap = [];
heapAdd(heap, 5);
heapAdd(heap, 8);
heapAdd(heap, 3);
console.log(heap); // Output: [8, 5, 3]
