func asBinaryString(n int) string {
    if n < 0 {
        return "-" + asBinaryString(-n)
    }
    if n == 0 || n == 1 {
        return strconv.Itoa(n)
    }
    lastDigit := n % 2
    return asBinaryString(n / 2) + strconv.Itoa(lastDigit)
}
