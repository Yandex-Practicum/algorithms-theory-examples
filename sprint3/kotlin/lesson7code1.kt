fun insertionSort(array: IntArray) {
    for (i in 1 until array.size) {
        val itemToInsert = array[i]
        var j = i
        while (j > 0 && itemToInsert < array[j - 1]) {
            array[j] = array[j - 1]
            j -= 1
        }
        array[j] = itemToInsert
        println("step $i, sorted ${i + 1} elements: ${array.toList()}")
    }
}

>>> insertionSort(intArrayOf(11, 2, 9, 7, 1))
step 1, sorted 2 elements: [2, 11, 9, 7, 1]
step 2, sorted 3 elements: [2, 9, 11, 7, 1]
step 3, sorted 4 elements: [2, 7, 9, 11, 1]
step 4, sorted 5 elements: [1, 2, 7, 9, 11]
