#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> visitors {0,2,3,2,0,4,1,1,2};
    vector<int> entries_by_visitor(5, 0);
    int best_visitor = 0;

    for (int i = 0; i < visitors.size(); i++) {
        int visitor = visitors[i];
        entries_by_visitor[visitor]++;
        if (entries_by_visitor[visitor] > entries_by_visitor[best_visitor]) {
            best_visitor = visitor;
        }
    }

    cout << best_visitor << endl;

    return 0;
}
