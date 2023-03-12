func asBinaryString(n int) string {
    if n < 0 {
        return "-" + asBinaryString(-n)
    }
    lastDigit := n % 2
    return asBinaryString(n / 2) + strconv.Itoa(lastDigit)
}
