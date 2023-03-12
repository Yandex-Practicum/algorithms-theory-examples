val digitLengths = intArrayOf(4, 4, 3, 3, 6, 4, 5, 4, 6, 6)  // длины слов «ноль», «один»,...

fun keyForCard(card: Int): List<Int> {
    return listOf(-digitLengths[card], card)
}

val cards = intArrayOf(2, 3 ,7)
cards.sortBy { keyForCard(it) }
println(cards.toList())
