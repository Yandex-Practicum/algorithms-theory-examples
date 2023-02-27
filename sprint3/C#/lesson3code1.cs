using System;

public class BinarySearch
{
    public static int Search(int[] arr, int x, int left, int right)
    {
        if (right <= left) // промежуток пуст
        {
            return -1;
        }

        // промежуток не пуст
        int mid = (left + right) / 2;

        if (arr[mid] == x) // центральный элемент — искомый
        {
            return mid;
        }
        else if (x < arr[mid]) // искомый элемент меньше центрального значит следует искать в левой половине
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
        int[] arr = { 2, 4, 6, 8, 10 };
        int x = 6;
        int index = Search(arr, x, left: 0, right: arr.Length);
        Console.WriteLine("Index of " + x + " is " + index);
    }
}

