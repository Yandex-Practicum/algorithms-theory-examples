public static int[] prefixFunction(String s) {
    int N = s.length();
    int[] π = new int[N];
    for (int i = 1; i < N; i++) {
        int k = π[i-1];
        while (k > 0 && s.charAt(k) != s.charAt(i)) {
            k = π[k-1];
        }
        if (s.charAt(k) == s.charAt(i)) {
            k++;
        }
        π[i] = k;
    }
    return π;
}
