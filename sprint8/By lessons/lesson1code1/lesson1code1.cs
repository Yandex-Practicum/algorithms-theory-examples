using System;

class Program
{
    // Вставить строку substring в строку string перед позицией index.
    static string Insert(string str, int index, string substr) {
        int length = str.Length;
        int shift = substr.Length;
        if (index > length) {
            // index == length - край строки
            throw new ArgumentException("Нет такой позиции");
        }
        str = str.PadRight(length + shift);
        if (length > 0) {
            // Если length == 0, делать сдвиг нет смысла.
            // Кроме того, не следует в вычислениях писать (length - 1),
            // не проверив, что индекс не ноль.
            // В некоторых языках длина представляется беззнаковым целым числом,
            // в таком случае (length - 1) будет равен не -1, а числу MAX_INT,
            // и цикл станет некорректным. Мы этого избегаем.
            for (int i = length - 1; i >= index; i--) {
                str = str.Substring(0, i + shift) + str[i] + str.Substring(i + shift + 1);
            }
        }
        for (int i = 0; i < shift; i++) {
            str = str.Substring(0, index + i) + substr[i] + str.Substring(index + i + 1);
        }
        return str;
    }
    
    static void Main(string[] args)
    {
        string str = "Hello, world!";
        int index = 7;
        string substr = "my ";
        Console.WriteLine(Insert(str, index, substr));  // "Hello, my world!"
    }
}
