#include <iostream>
#include <map>
#include <vector>

using namespace std;

int main() {
    vector<string> fruits = {"яблоко", "яблоко", "груша", "яблоко", "слива"};
    map<string, int> fruitCount;
    for (string fruit : fruits) {
        if (fruitCount.find(fruit) == fruitCount.end()) {
            fruitCount[fruit] = 0;
        }
        fruitCount[fruit]++;
    }

    for (auto fruit : fruitCount) {
        cout << fruit.first << ": " << fruit.second << endl;
    }

    return 0;
}
