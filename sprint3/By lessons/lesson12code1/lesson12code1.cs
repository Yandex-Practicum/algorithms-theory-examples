using System;
using System.Collections.Generic;
using System.Linq;

class Program {
    static (List<int>, List<int>, List<int>) Partition(List<int> array, int pivot) {
        List<int> left = new List<int>(), center = new List<int>(), right = new List<int>();
        foreach (int x in array) {
            if (x < pivot) {
                left.Add(x);
            } else if (x == pivot) {
                center.Add(x);
            } else {
                right.Add(x);
            }
        }
        return (left, center, right);
    }

    static List<int> Quicksort(List<int> array) {
        if (array.Count < 2) {
            return array;
        } else {
            Random rand = new Random();
            int pivot = array[rand.Next(array.Count)];
            var (left, center, right) = Partition(array, pivot);
            var sortedLeft = Quicksort(left);
            var sortedRight = Quicksort(right);
            List<int> result = new List<int>();
            result.AddRange(sortedLeft);
            result.AddRange(center);
            result.AddRange(sortedRight);
            return result;
        }
    }

    static void Main(string[] args) {
        List<int> arr = new List<int> {5, 2, 8, 4, 7, 1, 3, 6};
        var result = Quicksort(arr);
        foreach (int x in result) {
            Console.Write(x + " ");
        }
        Console.WriteLine();
    }
}
