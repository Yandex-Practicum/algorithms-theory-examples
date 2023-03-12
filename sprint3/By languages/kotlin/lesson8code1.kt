val digitLengths = intArrayOf(4, 4, 3, 3, 6, 4, 5, 4, 6, 6) // длины слов «ноль», «один»,...

fun cardStrength(card: Int) = digitLengths[card] // ключ сравнения

// воспользуемся уже знакомой сортировкой вставками
fun insertionSortByKey(array: IntArray, key: (Int) -> Int) {
  for (i in 1 until array.size) {
    val itemToInsert = array[i]
    var j = i
    // заменим сравнение item_to_insert < array[j-1] на сравнение ключей
    while (j > 0 && key(itemToInsert) < key(array[j - 1])) {
      array[j] = array[j - 1]
      j--
    }
    array[j] = itemToInsert
  }
}

val cards = intArrayOf(3, 7, 9, 2, 3)
insertionSortByKey(cards) { cardStrength(it) }
