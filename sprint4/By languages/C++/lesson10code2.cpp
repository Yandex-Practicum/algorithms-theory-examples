#include <vector>
#include <set>
#include <unordered_set>
#include <algorithm>
#include <tuple>

std::set<std::tuple<int, int, int>> effectiveSolution(int A, const std::vector<int>& x) {
    std::unordered_set<int> history;
    int n = x.size();
    std::vector<int> xSorted(x);
    std::sort(xSorted.begin(), xSorted.end());
    std::set<std::tuple<int, int, int>> triples;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int target = A - xSorted[i] - xSorted[j];
            if (history.count(target) > 0) {
                // Заметим, что тут тройка уже отсортирована за счёт предварительной
                // сортировки всего массива.
                triples.insert(std::make_tuple(target, xSorted[i], xSorted[j]));
            }
            history.insert(xSorted[i]);
        }
    }
    return triples;
}
