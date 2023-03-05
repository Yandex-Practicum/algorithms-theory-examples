function get_smaller_primes(n) {
    const smaller_primes = [];
    for (let num = 2; num <= n; num++) {
        if (is_prime(num)) {
            smaller_primes.push(num);
        }
    }
    return smaller_primes;
}
