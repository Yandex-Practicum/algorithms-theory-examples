def as_binary_string(n):
    if n < 0:
        return "-" + as_binary_string(-n)
    last_digit = n % 2
    return as_binary_string(n // 2) + str(last_digit)

