package main

import (
    "fmt"
    "sort"
)

var digitLengths = []int{4, 4, 3, 3, 6, 4, 5, 4, 6, 6} // длины слов «ноль», «один»,...

func keyForCard(card int) []int {
    return []int{-digitLengths[card], card}
}

func main() {
    cards := []int{2, 3, 7}
    sort.Slice(cards, func(i, j int) bool {
        keyI := keyForCard(cards[i])
        keyJ := keyForCard(cards[j])
        if keyI[0] == keyJ[0] {
            return keyI[1] < keyJ[1]
        } 
        return keyI[0] < keyJ[0]
    })
    fmt.Println(cards)
}
