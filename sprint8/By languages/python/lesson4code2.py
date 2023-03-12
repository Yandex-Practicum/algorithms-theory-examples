def find_all(text, pattern):
    occurrences = []
    start = 0 # Начнём поиск с начала строки.
    # Найдём первое вхождение, если оно есть.
    while True:
        pos = find(text, pattern, start)
        if pos == -1:
            break
        occurrences.append(pos) # Сохраним вхождение в список.
        start = pos + 1       # И продолжим поиск, начиная с позиции, 
                              # следующей за только что найденной.
    return occurrences
