using System;
using System.Collections.Generic;

public class Program
{
    static List<int> digit_lengths = new List<int> { 4, 4, 3, 3, 6, 4, 5, 4, 6, 6 }; // длины слов «ноль», «один»,...

    static int card_strength(int card) // ключ сравнения
    {
        return digit_lengths[card];
    }

    // воспользуемся уже знакомой сортировкой вставками
    static void insertion_sort_by_key(List<int> array, Func<int, int> key)
    {
        for (int i = 1; i < array.Count; i++)
        {
            int item_to_insert = array[i];
            int j = i;
            // заменим сравнение item_to_insert < array[j-1] на сравнение ключей
            while (j > 0 && key(item_to_insert) < key(array[j - 1]))
            {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = item_to_insert;
        }
    }

    public static void Main()
    {
        List<int> cards = new List<int> { 3, 7, 9, 2, 3 };
        insertion_sort_by_key(cards, card_strength);
        foreach (int card in cards)
        {
            Console.Write(card + " ");
        }
        Console.WriteLine();
    }
}
