#include <iostream>
#include <vector>

std::vector<int> heapsort(const std::vector<int>& array) {
    // Создадим пустую бинарную кучу.
    std::vector<int> heap;

    // Вставим в неё по одному все элементы массива, сохраняя свойства кучи.
    for (const auto& item : array) {
        heap_add(heap, item);   // код для heap_add можно посмотреть в прошлом уроке
    }

    // Будем извлекать из неё наиболее приоритетные элементы, удаляя их из кучи.
    std::vector<int> sortedArray;
    int i = 0;
    while (!heap.empty()) {
        int max = pop_max(heap);
        sortedArray.push_back(max);
        i += 1;
    }
    return sortedArray;
}

