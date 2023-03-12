public static int[] mergeSort(int[] array) {
    if (array.length == 1) {  // базовый случай рекурсии
        return array;
    }

    // запускаем сортировку рекурсивно на левой половине
    int[] left = mergeSort(Arrays.copyOfRange(array, 0, array.length/2));

    // запускаем сортировку рекурсивно на правой половине
    int[] right = mergeSort(Arrays.copyOfRange(array, array.length/2, array.length));

    // заводим массив для результата сортировки
    int[] result = new int[array.length];

    // сливаем результаты
    int l = 0, r = 0, k = 0;
    while (l < left.length && r < right.length) { 
        // выбираем, из какого массива забрать минимальный элемент
        if (left[l] <= right[r]) { 
            result[k] = left[l];
            l++;
        } else {
            result[k] = right[r];
            r++;
        }
        k++;
    }

    // Если один массив закончился раньше, чем второй, то
    // переносим оставшиеся элементы второго массива в результирующий
    while (l < left.length) { 
        result[k] = left[l];   // перенеси оставшиеся элементы left в result
        l++;
        k++;
    }
    while (r < right.length) { 
        result[k] = right[r];  // перенеси оставшиеся элементы right в result
        r++;
        k++;
    }

    return result;
}
