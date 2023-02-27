fun getLeastPrimesLinear(n: Int): Pair<IntArray, IntArray> {
    val lp = IntArray(n + 1) { 0 }
    val primes = mutableListOf<Int>()
    for (i in 2..n) {
        if (lp[i] == 0) {
            lp[i] = i
            primes.add(i)
        }
        for (p in primes) {
            val x = p * i
            if (p > lp[i] || x > n) {
                break
            }
            lp[x] = p
        }
    }
    return primes.toIntArray() to lp
}
