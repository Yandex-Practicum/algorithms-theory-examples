int N = s.length();
vector<int> π(N, 0);

for (int i = 1; i < N; i++) {
    string substring = s.substr(0, i);
    for (int k = i - 1; k >= 0; k--) {
        string prefix = substring.substr(0, k);
        string suffix = substring.substr(i - k, i);
        if (prefix == suffix) {
            π[i-1] = k;
            break;
        }
    }
}
