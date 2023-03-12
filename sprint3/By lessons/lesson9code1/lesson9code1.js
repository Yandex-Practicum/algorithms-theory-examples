let digit_lengths = [4, 4, 3, 3, 6, 4, 5, 4, 6, 6]; // длины слов «ноль», «один»,...

function key_for_card(card) {
    return [-digit_lengths[card], card];
}

let cards = [2, 3, 7];
cards.sort((a, b) => key_for_card(a) < key_for_card(b) ? -1 : 1);
console.log(cards);
