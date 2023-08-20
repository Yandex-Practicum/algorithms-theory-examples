func eratosthenes(_ n: Int) -> [Bool] {
    var numbers = Array(repeating: true, count: n + 1)
    numbers[0] = false
    numbers[1] = false
    for num in 2..<n {
        if numbers[num] {
            var j = 2 * num
            while j <= n {
                numbers[j] = false
                j += num
            }
        }
    }
    return numbers
}