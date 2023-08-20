func asBinaryString(_ n: Int) -> String {
    if n < 0 {
        return "-" + asBinaryString(-n)
    }
    let lastDigit = n % 2
    return asBinaryString(n / 2) + String(lastDigit)
}

