using System;
using System.Collections.Generic;

class HeapFunctions
{
    static void HeapAdd(List<int> heap, int key)
    {
        int index = heap.Count + 1;
        heap.Insert(index - 1, key);
        SiftUp(heap, index);
    }

    static void SiftUp(List<int> heap, int index)
    {
        if (index == 1) return;

        int parentIndex = index / 2;
        if (heap[parentIndex - 1] < heap[index - 1])
        {
            int temp = heap[parentIndex - 1];
            heap[parentIndex - 1] = heap[index - 1];
            heap[index - 1] = temp;
            SiftUp(heap, parentIndex);
        }
    }

    static void Main(string[] args)
    {
        List<int> heap = new List<int>();
        HeapAdd(heap, 5);
        HeapAdd(heap, 8);
        HeapAdd(heap, 3);
        Console.WriteLine(string.Join(", ", heap)); // Output: 8, 5, 3
    }
}
