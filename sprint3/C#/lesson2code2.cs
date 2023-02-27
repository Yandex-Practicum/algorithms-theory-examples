using System;

class Program {
    static void stairs_builder(int n) {
        if (n == 0) {
            return;
        }
        // build 1 step
        Console.WriteLine($"Осталось построить {n} ступеней.");
        stairs_builder(n - 1);
    }

    static void Main(string[] args) {
        stairs_builder(5);
    }
}
