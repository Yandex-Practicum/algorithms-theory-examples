import java.util.*;

public class Solution {
    public static Set<Triple<Integer, Integer, Integer>> effectiveSolution(int A, List<Integer> x) {
        Set<Integer> history = new HashSet<>();
        int n = x.size();
        List<Integer> xSorted = new ArrayList<>(x);
        Collections.sort(xSorted);
        Set<Triple<Integer, Integer, Integer>> triples = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int target = A - xSorted.get(i) - xSorted.get(j);
                if (history.contains(target)) {
                    // Заметим, что тут тройка уже отсортирована за счёт предварительной
                    // сортировки всего массива.
                    triples.add(new Triple<>(target, xSorted.get(i), xSorted.get(j)));
                }
                history.add(xSorted.get(i));
            }
        }
        return triples;
    }
}
