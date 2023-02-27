fun as_binary_string(n: Int): String {
    if (n < 0) return "-" + as_binary_string(-n)
    val lastDigit = n % 2
    return as_binary_string(n / 2) + lastDigit.toString()
}