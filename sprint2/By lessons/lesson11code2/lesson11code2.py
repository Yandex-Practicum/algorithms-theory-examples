def factorial(n):
    accumulator = 1
    i = n
    while i > 1:
        accumulator *= i
        i -= 1
    return accumulator
