func isPrime(_ n: Int) -> Bool {
    if n == 1 {
        return false
    }
    var i = 2
    while i * i <= n {
        if n % i == 0 {
            return false
        }
        i += 1
    }
    return true
}