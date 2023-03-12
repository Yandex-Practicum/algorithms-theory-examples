let digit_lengths = [4, 4, 3, 3, 6, 4, 5, 4, 6, 6]; // длины слов «ноль», «один»,...

function is_first_card_weaker(card_1, card_2) { // функция-компаратор
    return digit_lengths[card_1] < digit_lengths[card_2];
}

// воспользуемся уже знакомой сортировкой вставками
function insertion_sort_by_comparator(array, less) {
    for (let i = 1; i < array.length; i++) {
        let item_to_insert = array[i];
        let j = i;
        // заменим сравнение item_to_insert < array[j-1] на компаратор less
        while (j > 0 && less(item_to_insert, array[j-1])) {
            array[j] = array[j-1];
            j--;
        }
        array[j] = item_to_insert;
    }
}

let cards = [3, 7, 9, 2, 3];
insertion_sort_by_comparator(cards, is_first_card_weaker);
console.log(cards);
