func factorial(_ n: Int) -> Int {
    var accumulator = 1
    var i = n
    while i > 1 {
        accumulator *= i
        i -= 1
    }
    return accumulator
}