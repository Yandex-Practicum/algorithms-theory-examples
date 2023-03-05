def find_element(numbers, x):
    for i in range(len(numbers)): # проходим по всем элементам массива
        if numbers[i] == x: # сравниваем их с иксом
            return i  # если нашли - возвращаем индекс
    return -1  # если не нашли - возвращаем -1