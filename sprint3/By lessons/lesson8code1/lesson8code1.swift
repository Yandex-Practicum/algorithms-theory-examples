let digitLengths = [4, 4, 3, 3, 6, 4, 5, 4, 6, 6] // длины слов «ноль», «один»,...

func cardStrength(card: Int) -> Int { // ключ сравнения
    return digitLengths[card]
}

// воспользуемся уже знакомой сортировкой вставками
func insertionSortByKey<T>(_ array: inout [T], key: (T) -> Int) {
    for i in 1..<array.count {
        let itemToInsert = array[i]
        var j = i
        // заменим сравнение key(itemToInsert) < key(array[j-1]) на сравнение ключей
        while j > 0 && key(itemToInsert) < key(array[j - 1]) {
            array[j] = array[j - 1]
            j -= 1
        }
        array[j] = itemToInsert
    }
}

var cards = [3, 7, 9, 2, 3]
insertionSortByKey(&cards, key: cardStrength)
print(cards) // Вывод: [3, 2, 3, 7, 9]
