using System;
using System.Collections.Generic;

class Program
{
    static List<int> heapsort(List<int> array)
    {
        // Создадим пустую бинарную кучу.
        List<int> heap = new List<int>();

        // Вставим в неё по одному все элементы массива, сохраняя свойства кучи.
        foreach (int item in array)
        {
            heap_add(heap, item);   // код для heap_add можно посмотреть в прошлом уроке
        }

        // Будем извлекать из неё наиболее приоритетные элементы, удаляя их из кучи.
        List<int> sortedArray = new List<int>();
        int i = 0;
        while (heap.Count > 0)
        {
            int max = pop_max(heap);
            sortedArray.Add(max);
            i += 1;
        }
        return sortedArray;
    }
}