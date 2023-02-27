package main

import "fmt"

var digitLengths = []int{4, 4, 3, 3, 6, 4, 5, 4, 6, 6} // длины слов «ноль», «один»,...

func isFirstCardWeaker(card1, card2 int) bool { // функция-компаратор
    return digitLengths[card1] < digitLengths[card2]
}

// воспользуемся уже знакомой сортировкой вставками
func insertionSortByComparator(array []int, less func(int, int) bool) {
    for i := 1; i < len(array); i++ {
        itemToInsert := array[i]
        j := i
        // заменим сравнение itemToInsert < array[j-1] на компаратор less
        for j > 0 && less(itemToInsert, array[j-1]) {
            array[j] = array[j-1]
            j--
        }
        array[j] = itemToInsert
    }
}

func main() {
    cards := []int{3, 7, 9, 2, 3}
    insertionSortByComparator(cards, isFirstCardWeaker)
    fmt.Println(cards)
}
