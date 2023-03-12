using System;

class Program
{
    static void Main(string[] args)
    {
        Func(1);
        Func(2);
        Func(3);

        SayHello("Гоша");
    }

    static void Func(int step)
    {
        Console.WriteLine("Call me. Step: " + step);
    }

    static void SayHello(string name)
    {
        Console.WriteLine("Привет, " + name);
        PrintHoroscope(name.ToUpper());
        Console.WriteLine("Пока, " + name + ", хорошего дня!");
    }

    static void PrintHoroscope(string name)
    {
        Console.WriteLine(name + "! Сегодня подходящий день для прогулок в парке и изучения рекурсии");
    }
}
