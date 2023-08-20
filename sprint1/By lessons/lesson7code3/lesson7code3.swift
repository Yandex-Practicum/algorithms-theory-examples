func getSmallerPrimes(_ n: Int) -> [Int] {
    var smallerPrimes = [Int]()
    for num in 2...n {
        if isPrime(num) {
            smallerPrimes.append(num)
        }
    }
    return smallerPrimes
}