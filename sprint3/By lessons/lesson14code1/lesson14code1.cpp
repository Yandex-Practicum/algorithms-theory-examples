#include <vector>

std::vector<int> counting_sort(std::vector<int>& array, int k) {
    std::vector<int> counted_values(k, 0);
    for (int value : array) {
        counted_values[value]++;
    }

    int index = 0;
    for (int value = 0; value < k; value++) {
        for (int amount = 0; amount < counted_values[value]; amount++) {
            array[index] = value;
            index++;
        }
    }
    return array;
}
