val digitLengths = intArrayOf(4, 4, 3, 3, 6, 4, 5, 4, 6, 6)  // длины слов «ноль», «один»,...

fun isFirstCardWeaker(card1: Int, card2: Int): Boolean {  // функция-компаратор
    return digitLengths[card1] < digitLengths[card2]
}

// воспользуемся уже знакомой сортировкой вставками
fun insertionSortByComparator(array: IntArray, less: (Int, Int) -> Boolean) {
    for (i in 1 until array.size) {
        val itemToInsert = array[i]
        var j = i
        // заменим сравнение item_to_insert < array[j-1] на компаратор less
        while (j > 0 && less(itemToInsert, array[j - 1])) {
            array[j] = array[j - 1]
            j--
        }
        array[j] = itemToInsert
    }
}

val cards = intArrayOf(3, 7, 9, 2, 3)
insertionSortByComparator(cards, ::isFirstCardWeaker)
