function heapsort(array) {
    // Создадим пустую бинарную кучу.
    let heap = [];

    // Вставим в неё по одному все элементы массива, сохраняя свойства кучи.
    for (let item of array) {
        heap_add(heap, item);   // код для heap_add можно посмотреть в прошлом уроке
    }

    // Будем извлекать из неё наиболее приоритетные элементы, удаляя их из кучи.
    let sortedArray = [];
    let i = 0;
    while (heap.length > 0) {
        let max = pop_max(heap);
        sortedArray.push(max);
        i += 1;
    }
    return sortedArray;
}
