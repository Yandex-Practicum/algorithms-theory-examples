#include <iostream>
#include <vector>

using namespace std;

void insertion_sort(vector<int>& array) {
    for (int i = 1; i < array.size(); i++) {
        int item_to_insert = array[i];
        int j = i;
        while (j > 0 && item_to_insert < array[j - 1]) {
            array[j] = array[j - 1];
            j--;
        }
        array[j] = item_to_insert;
        cout << "step " << i << ", sorted " << i + 1 << " elements: ";
        for (int k = 0; k <= i; k++) {
            cout << array[k] << " ";
        }
        cout << endl;
    }
}
