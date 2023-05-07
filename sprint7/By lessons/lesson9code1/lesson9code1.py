# Заполняем массив нулями, так как длина НОВП в худшем случае равна нулю.
# Большую оценку без просмотра последовательностей мы не можем получить.
dp = [[0] for i in range(n + 1)] for j in range(m + 1)]
for i in range(1, n + 1):
  for j in range(1, m + 1):
    if A[i - 1] == B[j - 1]:
      max_len = 0
      for i_prev in range(1, i):
			  if A[i_prev - 1] >= A[i - 1]:
          continue
        for j_prev in range(1, j):
          max_len = max(max_len, dp[i_prev][j_prev])
      dp[i][j] = max_len + 1
# Надо перебрать все пары концов НОВП, чтобы найти оптимальный ответ.
answer = 0
for i in range(n + 1):
  for j in range(m + 1):
    answer = max(answer, dp[i][j])
