fun getSmallerPrimes(n: Int): List<Int> {
    val smallerPrimes = mutableListOf<Int>()
    for (num in 2..n) {
        if (isPrime(num)) {
            smallerPrimes.add(num)
        }
    }
    return smallerPrimes
}
