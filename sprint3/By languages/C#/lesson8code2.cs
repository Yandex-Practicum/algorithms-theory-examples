using System;
using System.Collections.Generic;

class Program {
    static List<int> digit_lengths = new List<int> {4, 4, 3, 3, 6, 4, 5, 4, 6, 6}; // длины слов «ноль», «один»,...

    static bool is_first_card_weaker(int card_1, int card_2) { // функция-компаратор
        return digit_lengths[card_1] < digit_lengths[card_2];
    }

    // воспользуемся уже знакомой сортировкой вставками
    static void insertion_sort_by_comparator(List<int> array, Func<int, int, bool> less) {
        for (int i = 1; i < array.Count; i++) {
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

    static void Main() {
        List<int> cards = new List<int> {3, 7, 9, 2, 3};
        insertion_sort_by_comparator(cards, is_first_card_weaker);
        foreach (int card in cards) {
            Console.Write(card + " ");
        }
        Console.WriteLine();
    }
}
