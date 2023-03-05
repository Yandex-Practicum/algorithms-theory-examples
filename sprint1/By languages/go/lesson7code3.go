func getSmallerPrimes(n int) []int {
    smaller_primes := []int{}
    for num := 2; num <= n; num++ {
        if isPrime(num) {
            smaller_primes = append(smaller_primes, num)
        }
    }
    return smaller_primes
}

func isPrime(n int) bool {
    if n < 2 {
        return false
    }
    for i := 2; i*i <= n; i++ {
        if n%i == 0 {
            return false
        }
    }
    return true
}