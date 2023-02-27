using System;
using System.Collections.Generic;
using System.Linq;

public static class Solution {
    public static HashSet<Tuple<int, int, int>> EffectiveSolution(int A, List<int> x) {
        HashSet<int> history = new HashSet<int>();
        int n = x.Count;
        List<int> xSorted = new List<int>(x);
        xSorted.Sort();
        HashSet<Tuple<int, int, int>> triples = new HashSet<Tuple<int, int, int>>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int target = A - xSorted[i] - xSorted[j];
                if (history.Contains(target)) {
                    // Заметим, что тут тройка уже отсортирована за счёт предварительной
                    // сортировки всего массива.
                    triples.Add(Tuple.Create(target, xSorted[i], xSorted[j]));
                }
                history.Add(xSorted[i]);
            }
        }
        return triples;
    }
}
