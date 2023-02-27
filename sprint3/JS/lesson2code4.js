function as_binary_string(n) {
    if (n < 0) {
        return "-" + as_binary_string(-n);
    }
    if (n == 0 || n == 1) {
        return n.toString();
    }
    let last_digit = n % 2;
    return as_binary_string(Math.floor(n / 2)) + last_digit.toString();
}
