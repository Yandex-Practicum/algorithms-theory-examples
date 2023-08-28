using System;
using System.Collections.Generic;

class HeapFunctions
{
    static int PopMax(List<int> heap)
    {
        int result = heap[0];
        heap[0] = heap[heap.Count - 1];
        heap.RemoveAt(heap.Count - 1);
        SiftDown(heap, 0);
        return result;
    }

    static void SiftDown(List<int> heap, int index)
    {
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left >= heap.Count)
        {
            return;
        }

        int indexLargest = left;
        if (right < heap.Count && heap[left] < heap[right])
        {
            indexLargest = right;
        }

        if (heap[index] < heap[indexLargest])
        {
            int temp = heap[index];
            heap[index] = heap[indexLargest];
            heap[indexLargest] = temp;
            SiftDown(heap, indexLargest);
        }
    }

    static void Main(string[] args)
    {
        List<int> heap = new List<int> { 8, 5, 3 };
        int maxValue = PopMax(heap);
        Console.WriteLine(maxValue); // Output: 8
        Console.WriteLine(string.Join(", ", heap)); // Output: 5, 3
    }
}
