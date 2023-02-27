digit_lengths = [4, 4, 3, 3, 6, 4, 5, 4, 6, 6]  # длины слов «ноль», «один»,...

def key_for_card(card):
    return [-digit_lengths[card], card]

cards = [2, 3 ,7]
cards.sort(key=key_for_card)
print(cards)
