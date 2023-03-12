fun as_binary_string(n: Int): String {
    if (n < 0) return "-" + as_binary_string(-n)
    if (n == 0 || n == 1) return n.toString()
    val lastDigit = n % 2
    return as_binary_string(n / 2) + lastDigit.toString()
}