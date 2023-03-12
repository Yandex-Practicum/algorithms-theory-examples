public static String asBinaryString(int n) {
    if (n < 0) {
        return "-" + asBinaryString(-n);
    }
    int lastDigit = n % 2;
    return asBinaryString(n / 2) + Integer.toString(lastDigit);
}
