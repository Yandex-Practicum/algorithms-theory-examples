#include <iostream>
#include <vector>
using namespace std;

int solve(vector<int>& array) {
    int maximal_sum = 0;
    for (int i = 0; i < array.size(); ++i) {
        int current_sum = 0;
        for (int j = 0; j <= i; ++j) {
            current_sum += array[j];
        }
        if (maximal_sum < current_sum) {
            maximal_sum = current_sum;
        }
    }
    return maximal_sum;
}
