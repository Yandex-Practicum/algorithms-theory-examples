func asBinaryString(_ n: Int) -> String {
    if n < 0 {
        return "-" + asBinaryString(-n)
    }
    if n == 0 || n == 1 {
        return String(n)
    }
    let lastDigit = n % 2
    return asBinaryString(n / 2) + String(lastDigit)
}
