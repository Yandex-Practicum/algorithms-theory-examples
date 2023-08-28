function popMax(heap) {
    const result = heap[0];
    heap[0] = heap[heap.length - 1];
    heap.pop();
    siftDown(heap, 0);
    return result;
}

function siftDown(heap, index) {
    const left = 2 * index + 1;
    const right = 2 * index + 2;

    if (left >= heap.length) {
        return;
    }

    let indexLargest = left;
    if (right < heap.length && heap[left] < heap[right]) {
        indexLargest = right;
    }

    if (heap[index] < heap[indexLargest]) {
        [heap[index], heap[indexLargest]] = [heap[indexLargest], heap[index]];
        siftDown(heap, indexLargest);
    }
}

const heap = [8, 5, 3];
const maxValue = popMax(heap);
console.log(maxValue); // Output: 8
console.log(heap);     // Output: [5, 3]
