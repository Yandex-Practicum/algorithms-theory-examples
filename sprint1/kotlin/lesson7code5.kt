fun eratosthenesEffective(n: Int): BooleanArray {
    val numbers = BooleanArray(n + 1) { true }
    numbers[0] = false
    numbers[1] = false
    for (num in 2..n) {
        if (numbers[num]) {
            for (j in (num * num)..n step num) {
                numbers[j] = false
            }
        }
    }
    return numbers
}
