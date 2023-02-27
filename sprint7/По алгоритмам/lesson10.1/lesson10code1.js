// Заполняем массив нулями, так как длина НОВП в худшем случае равна нулю.
// Большую оценку без просмотра последовательностей мы не можем получить.
let dp = [];
for (let i = 0; i < n + 1; i++) {
  dp[i] = [];
  for (let j = 0; j < m + 1; j++) {
    dp[i][j] = 0;
  }
}

for (let i = 1; i < n + 1; i++) {
  for (let j = 1; j < m + 1; j++) {
    if (A[i - 1] == B[j - 1]) {
      let max_len = 0;
      for (let i_prev = 1; i_prev < i; i_prev++) {
        if (A[i_prev - 1] >= A[i - 1]) {
          continue;
        }
        for (let j_prev = 1; j_prev < j; j_prev++) {
          max_len = Math.max(max_len, dp[i_prev][j_prev]);
        }
      }
      dp[i][j] = max_len + 1;
    }
  }
}

// Надо перебрать все пары концов НОВП, чтобы найти оптимальный ответ.
let answer = 0;
for (let i = 0; i < n + 1; i++) {
  for (let j = 0; j < m + 1; j++) {
    answer = Math.max(answer, dp[i][j]);
  }
}
