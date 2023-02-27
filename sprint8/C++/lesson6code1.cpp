#include <iostream>
#include <vector>
#include <string>

std::vector<int> search(std::string p, std::string text) {
    std::vector<int> result;
    std::string s = p + '#' + text;
    std::vector<int> π(p.length(), 0);
    int π_prev = 0;
    for (int i = 1; i < s.length(); i++) {
        int k = π_prev;
        while (k > 0 && s[k] != s[i]) {
            k = π[k - 1];
        }
        if (s[k] == s[i]) {
            k += 1;
        }
        if (i < p.length()) {
            π[i] = k;
        }
        π_prev = k;
        if (k == p.length()) {
            result.push_back(i - 2 * p.length());
        }
    }
    return result;
}
