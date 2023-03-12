#include <iostream>

void build_matryoshka(int size, int n) {
    if (n >= 1) {
        std::cout << "Создаём низ матрёшки размера " << size << "." << std::endl;
        build_matryoshka(size - 1, n - 1);
        std::cout << "Создаём верх матрешки размера " << size << "." << std::endl;
    } else {
        return;
    }
}

int main() {
    build_matryoshka(4, 3);
    return 0;
}

# Получим вывод:
Создаём низ матрёшки размера 4.
Создаём низ матрёшки размера 3.
Создаём низ матрёшки размера 2.
Создаём верх матрёшки размера 2.
Создаём верх матрёшки размера 3.
Создаём верх матрёшки размера 4.