dp := make([][]int, n+1)
for i := range dp {
  dp[i] = make([]int, m+1)
}

for i := 0; i <= n; i++ {
  dp[i][0] = 0
}
for j := 0; j <= m; j++ {
  dp[0][j] = 0
}

for i := 1; i <= n; i++ {
  max_val := 0
  for j := 1; j <= m; j++ {
    dp[i][j] = dp[i-1][j]
    if A[i-1] == B[j-1] {
      dp[i][j] = max(dp[i][j], max_val+1)
    }
    if B[j-1] < A[i-1] {
      max_val = max(max_val, dp[i-1][j])
    }
  }
}

ans := 0
for j := 0; j <= m; j++ {
  ans = max(ans, dp[n][j])
}