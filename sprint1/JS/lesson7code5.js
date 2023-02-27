function eratosthenes_effective(n) {
    const numbers = new Array(n + 1).fill(true);
    numbers[0] = numbers[1] = false;
    for (let num = 2; num < n; num++) {
        if (numbers[num]) {
            for (let j = num * num; j <= n; j += num) {
                numbers[j] = false;
            }
        }
    }
    return numbers;
}
