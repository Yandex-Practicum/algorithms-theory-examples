#include <iostream>
#include <vector>
using namespace std;

vector<bool> eratosthenes_effective(int n) {
    vector<bool> numbers(n + 1, true);
    numbers[0] = numbers[1] = false;
    for (int num = 2; num < n; num++) {
        if (numbers[num]) {
            for (int j = num * num; j <= n; j += num) {
                numbers[j] = false;
            }
        }
    }
    return numbers;
}
