using System;

public class Program {
    static void Main(string[] args) {
        GenBinary(3, "");
    }

    static void GenBinary(int n, string prefix) {
        if (n == 0) {
            Console.WriteLine(prefix);
        } else {
            GenBinary(n - 1, prefix + "0");
            GenBinary(n - 1, prefix + "1");
        }
    }
}
