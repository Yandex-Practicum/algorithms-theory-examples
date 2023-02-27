public static List<int> FindAll(string text, string pattern)
{
    List<int> occurrences = new List<int>();
    int start = 0; // Начнём поиск с начала строки.
    // Найдём первое вхождение, если оно есть.
    int pos;
    while ((pos = Find(text, pattern, start)) != -1)
    {
        occurrences.Add(pos); // Сохраним вхождение в список.
        start = pos + 1;      // И продолжим поиск, начиная с позиции, 
                              // следующей за только что найденной.
    }
    return occurrences;
}