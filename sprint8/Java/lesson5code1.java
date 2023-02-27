int N = s.length();
int[] π = new int[N];

for (int i = 1; i < N; i++) {
    String substring = s.substring(0, i);
    for (int k = i - 1; k >= 0; k--) {
        String prefix = substring.substring(0, k);
        String suffix = substring.substring(i - k, i);
        if (prefix.equals(suffix)) {
            π[i-1] = k;
            break;
        }
    }
}
