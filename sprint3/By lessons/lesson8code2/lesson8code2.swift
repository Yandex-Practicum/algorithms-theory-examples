let digitLengths = [4, 4, 3, 3, 6, 4, 5, 4, 6, 6] // длины слов «ноль», «один»,...

func isFirstCardWeaker(card1: Int, card2: Int) -> Bool { // функция-компаратор
    return digitLengths[card1] < digitLengths[card2]
}

// воспользуемся уже знакомой сортировкой вставками
func insertionSortByComparator<T>(_ array: inout [T], less: (T, T) -> Bool) {
    for i in 1..<array.count {
        let itemToInsert = array[i]
        var j = i
        // заменим сравнение less(itemToInsert, array[j-1]) на компаратор less
        while j > 0 && less(itemToInsert, array[j - 1]) {
            array[j] = array[j - 1]
            j -= 1
        }
        array[j] = itemToInsert
    }
}

var cards = [3, 7, 9, 2, 3]
insertionSortByComparator(&cards, less: isFirstCardWeaker)
print(cards) // Вывод: [3, 2, 9, 7, 3]