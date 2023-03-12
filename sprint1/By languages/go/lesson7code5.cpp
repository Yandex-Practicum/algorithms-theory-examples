func eratosthenesEffective(n int) []bool {
    numbers := make([]bool, n+1)
    for i := 2; i <= n; i++ {
        numbers[i] = true
    }
    for num := 2; num < n; num++ {
        if numbers[num] {
            for j := num * num; j <= n; j += num {
                numbers[j] = false
            }
        }
    }
    numbers[0] = false
    numbers[1] = false
    return numbers
}
