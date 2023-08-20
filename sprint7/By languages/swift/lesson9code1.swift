var dp: [[Int]] = Array(repeating: Array(repeating: 0, count: m + 1), count: n + 1)

for i in 1...n {
    for j in 1...m {
        if A[i - 1] == B[j - 1] {
            var max_len = 0
            for i_prev in 1..<i {
                if A[i_prev - 1] >= A[i - 1] {
                    continue
                }
                for j_prev in 1..<j {
                    max_len = max(max_len, dp[i_prev][j_prev])
                }
            }
            dp[i][j] = max_len + 1
        }
    }
}

var answer = 0
for i in 0...n {
    for j in 0...m {
        answer = max(answer, dp[i][j])
    }
}

print(answer)
