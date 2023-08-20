func getLeastPrimesLinear(_ n: Int) -> ([Int], [Int]) {
    var lp = [Int](repeating: 0, count: n + 1)
    var primes = [Int]()
    for i in 2...n {
        if lp[i] == 0 {
            lp[i] = i
            primes.append(i)
        }   
        for p in primes {
            let x = p * i
            if p > lp[i] || x > n {
                break
            }
            lp[x] = p
        }
    }
    return (primes, lp)
}