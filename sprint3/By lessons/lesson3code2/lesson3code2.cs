using System;

public class BinarySearchDescending
{
    public static int Search(int[] arr, int x, int left, int right)
    {
        if (right <= left)
        {
            return -1;
        }

        // промежуток не пуст
        int mid = (left + right) / 2;

        if (arr[mid] == x) // центральный элемент — искомый
        {
            return mid;
        }
        else if (arr[mid] < x) // искомый элемент больше центрального на этот раз все элементы больше центрального располагаются в левой половине
        {
            return Search(arr, x, left, mid);
        }
        else // иначе следует искать в правой половине
        {
            return Search(arr, x, mid + 1, right);
        }
    }

    // изначально мы запускаем двоичный поиск на всей длине массива
    static void Main()
    {
        int[] arr = { 10, 8, 6, 4, 2 };
        int x = 6;
        int index = Search(arr, x, left: 0, right: arr.Length);
        Console.WriteLine("Index of " + x + " is " + index);
    }
}
