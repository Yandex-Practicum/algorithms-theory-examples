fun heapsort(array: List<Int>) : List<Int> {
  // Создадим пустую бинарную кучу.
  var heap = mutableListOf<Int>()
  
  // Вставим в неё по одному все элементы массива, сохраняя свойства кучи.
  for (item in array) {
    heap_add(heap, item)   // код для heap_add можно посмотреть в прошлом уроке
  }
  
  // Будем извлекать из неё наиболее приоритетные элементы, удаляя их из кучи.
  var sortedArray = mutableListOf<Int>()
  var i = 0
  while (heap.isNotEmpty()) {
    val max = pop_max(heap) 
    sortedArray.add(max)
    i += 1
  }
  return sortedArray
}
