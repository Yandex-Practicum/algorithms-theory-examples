def compare(first, second):
    if len(first) != len(second):
        return False

    length = len(first)
    for i in range(length):
        if first[i] != second[i]:
            return False

    return True
