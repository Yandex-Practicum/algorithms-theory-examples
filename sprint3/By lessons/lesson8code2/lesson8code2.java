import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static int[] digit_lengths = {4, 4, 3, 3, 6, 4, 5, 4, 6, 6}; // длины слов «ноль», «один»,...

    static boolean is_first_card_weaker(int card_1, int card_2) { // функция-компаратор
        return digit_lengths[card_1] < digit_lengths[card_2];
    }

    // воспользуемся уже знакомой сортировкой вставками
    static void insertion_sort_by_comparator(int[] array, Comparator<Integer> less) {
        for (int i = 1; i < array.length; i++) {
            int item_to_insert = array[i];
            int j = i;
            // заменим сравнение item_to_insert < array[j-1] на компаратор less
            while (j > 0 && less.compare(item_to_insert, array[j-1]) < 0) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = item_to_insert;
        }
    }

    public static void main(String[] args) {
        int[] cards = {3, 7, 9, 2, 3};
        Comparator<Integer> comparator = (card1, card2) -> Integer.compare(card1, card2);
        insertion_sort_by_comparator(cards, comparator);
        System.out.println(Arrays.toString(cards));
    }
}
