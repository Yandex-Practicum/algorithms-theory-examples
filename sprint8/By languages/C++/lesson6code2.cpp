vector<int> prefix_function(string s) {
    int N = s.length();
    vector<int> π(N, 0);
    for (int i = 1; i < N; i++) {
        int k = π[i - 1];
        while (k > 0 && s[k] != s[i]) {
            k = π[k - 1];
        }
        if (s[k] == s[i]) {
            k += 1;
        }
        π[i] = k;
    }
    return π;
}
