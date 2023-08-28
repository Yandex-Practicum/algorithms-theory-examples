def heapsort(array):
    # Создадим пустую бинарную кучу.
    heap = []

    # Вставим в неё по одному все элементы массива, сохраняя свойства кучи.
    for item in array:
        heap_add(heap, item)   # код для heap_add можно посмотреть в прошлом уроке

    # Будем извлекать из неё наиболее приоритетные элементы, удаляя их из кучи.
    sortedArray = []
    i = 0
    while heap:
        max_val = pop_max(heap) 
        sortedArray.append(max_val)
        i += 1
    return sortedArray
