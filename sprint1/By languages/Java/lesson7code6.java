public static Pair<List<Integer>, int[]> getLeastPrimesLinear(int n) {
    int[] lp = new int[n + 1];
    List<Integer> primes = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
        if (lp[i] == 0) {
            lp[i] = i;
            primes.add(i);
        }
        for (int j = 0; j < primes.size(); j++) {
            int p = primes.get(j);
            int x = p * i;
            if (p > lp[i] || x > n) {
                break;
            }
            lp[x] = p;
        }
    }
    return new Pair<>(primes, lp);
}
