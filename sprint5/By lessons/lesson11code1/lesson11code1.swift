func heapsort(array: [Int]) -> [Int] {
    // Создадим пустую бинарную кучу.
    var heap = [Int]()

    // Вставим в неё по одному все элементы массива, сохраняя свойства кучи.
    for item in array {
        heap_add(heap: &heap, key: item)   // код для heap_add можно посмотреть в прошлом уроке
    }

    // Будем извлекать из неё наиболее приоритетные элементы, удаляя их из кучи.
    var sortedArray = [Int]()
    var i = 0
    while !heap.isEmpty {
        let max = pop_max(heap: &heap)
        sortedArray.append(max)
        i += 1
    }
    return sortedArray
}
