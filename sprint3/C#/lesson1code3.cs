using System;

public class Program
{
    public static void BuildMatryoshka(int size, int n)
    {
        if (n >= 1)
        {
            Console.WriteLine($"Создаём низ матрёшки размера {size}.");
            BuildMatryoshka(size - 1, n - 1);
            Console.WriteLine($"Создаём верх матрешки размера {size}.");
        }
        else
        {
            return;
        }
    }

    public static void Main()
    {
        BuildMatryoshka(4, 3);
    }
}

# Получим вывод:
Создаём низ матрёшки размера 4.
Создаём низ матрёшки размера 3.
Создаём низ матрёшки размера 2.
Создаём верх матрёшки размера 2.
Создаём верх матрёшки размера 3.
Создаём верх матрёшки размера 4.