// Заполняем массив нулями, так как длина НОВП в худшем случае равна нулю.
// Большую оценку без просмотра последовательностей мы не можем получить.
int[,] dp = new int[n + 1, m + 1];
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= m; j++) {
        if (A[i - 1] == B[j - 1]) {
            int max_len = 0;
            for (int i_prev = 1; i_prev < i; i_prev++) {
                if (A[i_prev - 1] >= A[i - 1]) {
                    continue;
                }
                for (int j_prev = 1; j_prev < j; j_prev++) {
                    max_len = Math.Max(max_len, dp[i_prev, j_prev]);
                }
            }
            dp[i, j] = max_len + 1;
        }
    }
}
// Надо перебрать все пары концов НОВП, чтобы найти оптимальный ответ.
int answer = 0;
for (int i = 0; i <= n; i++) {
    for (int j = 0; j <= m; j++) {
        answer = Math.Max(answer, dp[i, j]);
    }
}
