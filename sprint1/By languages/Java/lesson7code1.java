public static boolean isPrime(int n) {
    if (n == 1) {
        return false;
    }
    int i = 2;
    while (i < n) {
        if (n % i == 0) {
            return false;
        }
        i = i + 1;
    }
    return true;
}
