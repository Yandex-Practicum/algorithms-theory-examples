package main

import (
	"fmt"
)

func heapsort(array []int) []int {
	// Создадим пустую бинарную кучу.
	heap := []int{}

	// Вставим в неё по одному все элементы массива, сохраняя свойства кучи.
	for _, item := range array {
		heap_add(heap, item)   // код для heap_add можно посмотреть в прошлом уроке
	}

	// Будем извлекать из неё наиболее приоритетные элементы, удаляя их из кучи.
	var sortedArray []int
	i := 0
	for len(heap) > 0 {
		max := pop_max(heap)
		sortedArray = append(sortedArray, max)
		i += 1
	}
	return sortedArray
}
