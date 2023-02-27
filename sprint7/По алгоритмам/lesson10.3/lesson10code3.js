const dp = Array.from({ length: n + 1 }, () => Array(m + 1).fill(0));
for (let i = 1; i <= n; i++) {
  let max_val = 0;
  for (let j = 1; j <= m; j++) {
    dp[i][j] = dp[i - 1][j];
    if (A[i - 1] === B[j - 1]) {
      dp[i][j] = Math.max(dp[i][j], max_val + 1);
    }
    if (B[j - 1] < A[i - 1]) {
      max_val = Math.max(max_val, dp[i - 1][j]);
    }
  }
}
