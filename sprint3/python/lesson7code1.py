def insertion_sort(array):
  for i in range(1, len(array)):
    item_to_insert = array[i]
    j = i
    while j > 0 and item_to_insert < array[j-1]:
      array[j] = array[j-1]
      j -= 1
    array[j] = item_to_insert
    print('step {}, sorted {} elements: {}'.format(i, i+1, array))

>>> insertion_sort([11, 2, 9, 7, 1])
step 1, sorted 2 elements: [2, 11, 9, 7, 1]
step 2, sorted 3 elements: [2, 9, 11, 7, 1]
step 3, sorted 4 elements: [2, 7, 9, 11, 1]
step 4, sorted 5 elements: [1, 2, 7, 9, 11]
