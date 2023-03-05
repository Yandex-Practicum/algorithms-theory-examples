func solve(array []int) int {
    maximal_sum := 0 // Сумма пустого префикса равна 0
    for i := 0; i < len(array); i++ {
        current_sum := 0
        for j := 0; j <= i; j++ {
            current_sum += array[j]
        }
        if maximal_sum < current_sum {
            maximal_sum = current_sum
        }
    }
    return maximal_sum
}
