#include <iostream>
#include <vector>
using namespace std;

vector<int> get_smaller_primes(int n) {
    vector<int> smaller_primes;
    for (int num = 2; num <= n; num++) {
        if (is_prime(num)) {
            smaller_primes.push_back(num);
        }
    }
    return smaller_primes;
}
