#include <iostream>
using namespace std;

int main() {
    int cg_count = 0;
    int left = 0; // replace with actual value
    int right = 10; // replace with actual value
    string sequence = "ATCGCTAGCG"; // replace with actual value

    for (int position = left; position < right; position++) {
        if (sequence[position] == 'C' || sequence[position] == 'G') {
            cg_count++;
        }
    }

    cout << cg_count << endl;

    return 0;
}
