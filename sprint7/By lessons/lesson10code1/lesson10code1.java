public static int findLongestNonDecreasingSubsequence(int[] A, int n, int m) {
    // Заполняем массив нулями, так как длина НОВП в худшем случае равна нулю.
    // Большую оценку без просмотра последовательностей мы не можем получить.
    int[][] dp = new int[n + 1][m + 1];
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            if (A[i - 1] == B[j - 1]) {
                int maxLen = 0;
                for (int iPrev = 1; iPrev < i; iPrev++) {
                    if (A[iPrev - 1] >= A[i - 1]) {
                        continue;
                    }
                    for (int jPrev = 1; jPrev < j; jPrev++) {
                        maxLen = Math.max(maxLen, dp[iPrev][jPrev]);
                    }
                }
                dp[i][j] = maxLen + 1;
            }
        }
    }

    // Надо перебрать все пары концов НОВП, чтобы найти оптимальный ответ.
    int answer = 0;
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= m; j++) {
            answer = Math.max(answer, dp[i][j]);
        }
    }
    return answer;
}
