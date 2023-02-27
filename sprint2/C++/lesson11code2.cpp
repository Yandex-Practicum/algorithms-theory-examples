#include <iostream>

int factorial(int n) {
    int accumulator = 1;
    int i = n;
    while (i > 1) {
        accumulator *= i;
        i -= 1;
    }
    return accumulator;
}


int main() {
    std::cout << factorial(5) << std::endl;  // 120
    return 0;
}
