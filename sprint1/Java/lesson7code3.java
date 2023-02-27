public static List<Integer> getSmallerPrimes(int n) {
    List<Integer> smallerPrimes = new ArrayList<>();
    for (int num = 2; num <= n; num++) {
        if (isPrime(num)) {
            smallerPrimes.add(num);
        }
    }
    return smallerPrimes;
}
