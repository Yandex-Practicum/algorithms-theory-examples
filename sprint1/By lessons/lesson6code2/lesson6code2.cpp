#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> cumulative_sums {0};
    int cg_count = 0;
    int left = 2; // replace with actual value
    int right = 8; // replace with actual value
    string sequence = "ATCGCTAGCG"; // replace with actual value

    for (int position = 0; position < sequence.size(); position++) {
        if (sequence[position] == 'C' || sequence[position] == 'G') {
            cg_count++;
        }
        cumulative_sums.push_back(cg_count);
    }

    cout << cumulative_sums[right] - cumulative_sums[left] << endl;

    return 0;
}
