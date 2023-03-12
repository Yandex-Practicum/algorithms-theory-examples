package main

import "fmt"

func buildMatryoshka(size int, n int) {
    if n >= 1 {
        fmt.Printf("Создаём низ матрёшки размера %d.\n", size)
        buildMatryoshka(size-1, n-1)
        fmt.Printf("Создаём верх матрешки размера %d.\n", size)
    } else {
        return
    }
}

func main() {
    buildMatryoshka(4, 3)
}

# Получим вывод:
Создаём низ матрёшки размера 4.
Создаём низ матрёшки размера 3.
Создаём низ матрёшки размера 2.
Создаём верх матрёшки размера 2.
Создаём верх матрёшки размера 3.
Создаём верх матрёшки размера 4.