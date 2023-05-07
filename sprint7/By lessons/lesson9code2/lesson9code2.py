dp = [[0] for i in range(n + 1)] for j in range(m + 1)]
for i in range(1, n + 1):
  for j in range(1, m + 1):
		# Сначала обновляем состояние согласно
    # второму варианту, когда A[i-1] не входит в НОВП.
    dp[i][j] = dp[i - 1][j]
    # Если A[i-1] == B[j-1], то можно сделать обновление dp[i][j] по первому
    # варианту, когда A[i-1] включается в НОВП.
    if A[i - 1] == B[j - 1]:
      max_val = 0
      for j_prev in range(1, j):
        if B[j_prev - 1] < B[j - 1]:
          max_val = max(max_val, dp[i - 1][j_prev])
      dp[i][j] = max(dp[i][j], 1 + max_val)
# Ответ находится в последней строке таблицы,
# но необязательно в клетке dp[n][m].
ans = 0
for j in range(m + 1):
  ans = max(ans, dp[n][j])