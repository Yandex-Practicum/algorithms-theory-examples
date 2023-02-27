package main

import "fmt"

var digitLengths = [10]int{4, 4, 3, 3, 6, 4, 5, 4, 6, 6} // длины слов «ноль», «один»,...

func cardStrength(card int) int { // ключ сравнения
    return digitLengths[card]
}

func insertionSortByKey(array []int, key func(int) int) {
    for i := 1; i < len(array); i++ {
        itemToInsert := array[i]
        j := i
        // заменим сравнение itemToInsert < array[j-1] на сравнение ключей
        for j > 0 && key(itemToInsert) < key(array[j-1]) {
            array[j] = array[j-1]
            j--
        }
        array[j] = itemToInsert
    }
}

func main() {
    cards := []int{3, 7, 9, 2, 3}
    insertionSortByKey(cards, cardStrength)
    fmt.Println(cards)
}
