def partition(array, pivot):
    left = [x for x in array if x < pivot]
    center = [x for x in array if x == pivot]
    right = [x for x in array if x > pivot]
    return left, center, right

def quicksort(array):
    if len(array) < 2:
        return array   # массивы с 0 или 1 элементами фактически отсортированы
    else:
        pivot = random.choice(array)
        left, center, right = partition(array, pivot)
        return quicksort(left) + center + quicksort(right)
