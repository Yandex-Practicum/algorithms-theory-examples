public static int FindElement(int[] numbers, int x)
{
    for (int i = 0; i < numbers.Length; i++) // проходим по всем элементам массива
    {
        if (numbers[i] == x) // сравниваем их с иксом
        {
            return i;  // если нашли - возвращаем индекс
        }
    }
    return -1;  // если не нашли - возвращаем -1
}
