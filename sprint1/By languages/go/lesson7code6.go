func getLeastPrimesLinear(n int) ([]int, []int) {
    lp := make([]int, n+1)
    primes := []int{}
    for i := 2; i <= n; i++ {
        if lp[i] == 0 {
            lp[i] = i
            primes = append(primes, i)
        }
        for _, p := range primes {
            x := p * i
            if p > lp[i] || x > n {
                break
            }
            lp[x] = p
        }
    }
    return primes, lp
}
