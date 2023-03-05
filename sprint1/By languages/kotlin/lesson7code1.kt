fun isPrime(n: Int): Boolean {
    if (n == 1) return false
    var i = 2
    while (i < n) {
        if (n % i == 0) return false
        i++
    }
    return true
}
