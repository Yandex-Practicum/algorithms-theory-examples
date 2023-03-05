#include <iostream>
#include <vector>
using namespace std;

pair<vector<int>, vector<int>> get_least_primes_linear(int n) {
    vector<int> lp(n + 1, 0);
    vector<int> primes;
    for (int i = 2; i <= n; ++i) {
        if (lp[i] == 0) {
            lp[i] = i;
            primes.push_back(i);
        }
        for (int j = 0; j < primes.size() && primes[j] <= lp[i] && i * primes[j] <= n; ++j) {
            lp[i * primes[j]] = primes[j];
        }
    }
    return make_pair(primes, lp);
}
