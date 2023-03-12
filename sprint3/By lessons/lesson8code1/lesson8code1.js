const digitLengths = [4, 4, 3, 3, 6, 4, 5, 4, 6, 6]; // длины слов «ноль», «один»,...

function cardStrength(card) { // ключ сравнения
    return digitLengths[card];
}

function insertionSortByKey(array, key) {
    for (let i = 1; i < array.length; i++) {
        const itemToInsert = array[i];
        let j = i;
        // заменим сравнение itemToInsert < array[j-1] на сравнение ключей
        while (j > 0 && key(itemToInsert) < key(array[j-1])) {
            array[j] = array[j-1];
            j--;
        }
        array[j] = itemToInsert;
    }
}

const cards = [3, 7, 9, 2, 3];
insertionSortByKey(cards, cardStrength);
console.log(cards);
