#include <iostream>
#include <vector>
using namespace std;

vector<int> digit_lengths = {4, 4, 3, 3, 6, 4, 5, 4, 6, 6}; // длины слов «ноль», «один»,...

bool is_first_card_weaker(int card_1, int card_2) { // функция-компаратор
    return digit_lengths[card_1] < digit_lengths[card_2];
}

// воспользуемся уже знакомой сортировкой вставками
void insertion_sort_by_comparator(vector<int>& array, bool (*less)(int, int)) {
    for (int i = 1; i < array.size(); i++) {
        int item_to_insert = array[i];
        int j = i;
        // заменим сравнение item_to_insert < array[j-1] на компаратор less
        while (j > 0 && less(item_to_insert, array[j-1])) {
            array[j] = array[j-1];
            j--;
        }
        array[j] = item_to_insert;
    }
}

int main() {
    vector<int> cards = {3, 7, 9, 2, 3};
    insertion_sort_by_comparator(cards, is_first_card_weaker);
    for (int i = 0; i < cards.size(); i++) {
        cout << cards[i] << " ";
    }
    cout << endl;
    return 0;
}
