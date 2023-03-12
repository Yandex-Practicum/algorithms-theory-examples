using System;
using System.Collections.Generic;

class Program {
    static void Main(string[] args) {
        var array = new List<int> { 5, 2, 4, 6, 1, 3 };
        InsertionSort(array);
    }

    static void InsertionSort(List<int> array) {
        for (int i = 1; i < array.Count; i++) {
            int item_to_insert = array[i];
            int j = i;
            while (j > 0 && item_to_insert < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = item_to_insert;
            Console.WriteLine($"step {i}, sorted {i + 1} elements: {string.Join(" ", array.GetRange(0, i + 1))}");
        }
    }
}
