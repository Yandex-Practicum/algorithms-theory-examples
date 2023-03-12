using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        List<string> fruits = new List<string> { "яблоко", "яблоко", "груша", "яблоко", "слива" };
        Dictionary<string, int> fruitCount = new Dictionary<string, int>();
        foreach (string fruit in fruits) {
            if (!fruitCount.ContainsKey(fruit)) {
                fruitCount[fruit] = 0;
            }
            fruitCount[fruit]++;
        }

        foreach (KeyValuePair<string, int> fruit in fruitCount) {
            Console.WriteLine("{0}: {1}", fruit.Key, fruit.Value);
        }
    }
}
