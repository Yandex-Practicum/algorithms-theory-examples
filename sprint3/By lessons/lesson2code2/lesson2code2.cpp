#include <iostream>

void stairs_builder(int n) {
    if (n == 0) {
        return;
    }
    // build 1 step
    std::cout << "Осталось построить " << n << " ступеней." << std::endl;
    stairs_builder(n - 1);
}

int main() {
    stairs_builder(5);
    return 0;
}
