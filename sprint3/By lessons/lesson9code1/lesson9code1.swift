let digitLengths = [4, 4, 3, 3, 6, 4, 5, 4, 6, 6] // длины слов «ноль», «один»,...

func keyForCard(_ card: Int) -> [Int] {
    return [-digitLengths[card], card]
}

var cards = [2, 3, 7]
cards.sort(by: { card1, card2 in
    let key1 = keyForCard(card1)
    let key2 = keyForCard(card2)
    return key1.lexicographicallyPrecedes(key2)
})
print(cards)