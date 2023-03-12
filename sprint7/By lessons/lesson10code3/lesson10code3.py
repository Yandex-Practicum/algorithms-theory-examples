dp = [[0] for i in range(n + 1)] for j in range(m + 1)]
for i in range(1, n + 1):
  max_val = 0
  for j in range(1, m + 1):
    dp[i][j] = dp[i - 1][j]
    if A[i - 1] == B[j - 1]:
      dp[i][j] = max(dp[i][j], max_val + 1)
    if B[j - 1] < A[i - 1]:
      max_val = max(max_val, dp[i - 1][j])