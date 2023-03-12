#include <iostream>
using namespace std;

void gen_binary(int n, string prefix) {
    if (n == 0) {
        cout << prefix << endl;
    } else {
        gen_binary(n - 1, prefix + "0");
        gen_binary(n - 1, prefix + "1");
    }
}

int main() {
    gen_binary(3, "");
    return 0;
}
