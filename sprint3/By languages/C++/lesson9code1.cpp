#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

vector<int> digit_lengths {4, 4, 3, 3, 6, 4, 5, 4, 6, 6}; // длины слов «ноль», «один»,...

vector<int> key_for_card(int card) {
    return {-digit_lengths[card], card};
}

int main() {
    vector<int> cards {2, 3, 7};
    sort(cards.begin(), cards.end(), [&](int a, int b) {
        return key_for_card(a) < key_for_card(b);
    });
    for (int card : cards) {
        cout << card << " ";
    }
    return 0;
}
