#include <iostream>
#include <vector>
#include <algorithm>

std::vector<int> partition(std::vector<int>& array, int pivot) {
    std::vector<int> left, center, right;
    for (int x : array) {
        if (x < pivot) {
            left.push_back(x);
        } else if (x == pivot) {
            center.push_back(x);
        } else {
            right.push_back(x);
        }
    }
    return {left, center, right};
}

std::vector<int> quicksort(std::vector<int>& array) {
    if (array.size() < 2) {
        return array;
    } else {
        int pivot = array[rand() % array.size()];
        auto [left, center, right] = partition(array, pivot);
        auto sorted_left = quicksort(left);
        auto sorted_right = quicksort(right);
        std::vector<int> result(sorted_left);
        result.insert(result.end(), center.begin(), center.end());
        result.insert(result.end(), sorted_right.begin(), sorted_right.end());
        return result;
    }
}

int main() {
    std::vector<int> arr = {5, 2, 8, 4, 7, 1, 3, 6};
    auto result = quicksort(arr);
    for (int x : result) {
        std::cout << x << " ";
    }
    std::cout << std::endl;
    return 0;
}
