public static int[] MergeSort(int[] array)
{
    if (array.Length == 1) // базовый случай рекурсии
        return array;

    // запускаем сортировку рекурсивно на левой половине
    int[] left = MergeSort(array.Take(array.Length / 2).ToArray());

    // запускаем сортировку рекурсивно на правой половине
    int[] right = MergeSort(array.Skip(array.Length / 2).ToArray());

    // заводим массив для результата сортировки
    int[] result = new int[array.Length];

    // сливаем результаты
    int l = 0, r = 0, k = 0;
    while (l < left.Length && r < right.Length)
    {
        // выбираем, из какого массива забрать минимальный элемент
        if (left[l] <= right[r])
        {
            result[k] = left[l];
            l++;
        }
        else
        {
            result[k] = right[r];
            r++;
        }
        k++;
    }

    // Если один массив закончился раньше, чем второй, то
    // переносим оставшиеся элементы второго массива в результирующий
    while (l < left.Length)
    {
        result[k] = left[l]; // перенеси оставшиеся элементы left в result
        l++;
        k++;
    }
    while (r < right.Length)
    {
        result[k] = right[r]; // перенеси оставшиеся элементы right в result
        r++;
        k++;
    }

    return result;
}
