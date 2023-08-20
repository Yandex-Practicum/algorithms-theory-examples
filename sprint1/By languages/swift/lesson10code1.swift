func solve(array: [Int]) -> Int {
    var maximalSum = 0 // Сумма пустого префикса равна 0
    for i in 0..<array.count {
        let currentSum = array[0...i].reduce(0, +)
        if maximalSum < currentSum {
            maximalSum = currentSum
        }
    }
    return maximalSum
}