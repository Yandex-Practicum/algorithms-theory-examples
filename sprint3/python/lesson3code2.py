def binarySearchDescending(arr, x, left, right):
    if right <= left:
        return -1
    # промежуток не пуст
    mid = (left + right) // 2
    if arr[mid] == x:  # центральный элемент — искомый
        return mid
    elif arr[mid] < x: # искомый элемент больше центрального на этот раз все элементы больше центрального располагаются в левой половине
        return binarySearchDescending(arr, x, left, mid)
    else: # иначе следует искать в правой половине
        return binarySearchDescending(arr, x, mid + 1, right)

# изначально мы запускаем двоичный поиск на всей длине массива
index = binarySearch(arr, x, left = 0, right = len(arr))
