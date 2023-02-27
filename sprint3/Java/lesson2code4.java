public static String asBinaryString(int n) {
    if (n < 0) {
        return "-" + asBinaryString(-n);
    }
    if (n == 0 || n == 1) {
        return Integer.toString(n);
    }
    int lastDigit = n % 2;
    return asBinaryString(n / 2) + Integer.toString(lastDigit);
}
