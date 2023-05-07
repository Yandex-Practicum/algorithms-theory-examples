int[][] dp = new int[n + 1][m + 1];
for (int i = 1; i <= n; i++) {
    int max_val = 0;
    for (int j = 1; j <= m; j++) {
        dp[i][j] = dp[i - 1][j];
        if (A[i - 1] == B[j - 1]) {
            dp[i][j] = Math.max(dp[i][j], max_val + 1);
        }
        if (B[j - 1] < A[i - 1]) {
            max_val = Math.max(max_val, dp[i - 1][j]);
        }
    }
}
int ans = 0;
for (int j = 1; j <= m; j++) {
    ans = Math.max(ans, dp[n][j]);
}
