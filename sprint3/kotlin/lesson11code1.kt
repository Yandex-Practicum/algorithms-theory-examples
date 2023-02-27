fun mergeSort(array: IntArray): IntArray {
    if (array.size == 1) {  // базовый случай рекурсии
        return array
    }

    // запускаем сортировку рекурсивно на левой половине
    val left = mergeSort(array.sliceArray(0 until array.size / 2))

    // запускаем сортировку рекурсивно на правой половине
    val right = mergeSort(array.sliceArray(array.size / 2 until array.size))

    // заводим массив для результата сортировки
    val result = IntArray(array.size)

    // сливаем результаты
    var l = 0
    var r = 0
    var k = 0
    while (l < left.size && r < right.size) { 
    // выбираем, из какого массива забрать минимальный элемент
        if (left[l] <= right[r]) {
            result[k] = left[l]
            l += 1
        } else {
            result[k] = right[r]
            r += 1
        }
        k += 1
    }

    // Если один массив закончился раньше, чем второй, то
    // переносим оставшиеся элементы второго массива в результирующий
    while (l < left.size) { 
        result[k] = left[l]   // перенеси оставшиеся элементы left в result
        l += 1
        k += 1
    }
    while (r < right.size) { 
        result[k] = right[r]  // перенеси оставшиеся элементы right в result
        r += 1
        k += 1
    }

    return result
}
