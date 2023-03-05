def get_smaller_primes(n):
    smaller_primes = []
    for num in range(2, n + 1):
        if is_prime(num):
            smaller_primes.append(num)
    return smaller_primes
