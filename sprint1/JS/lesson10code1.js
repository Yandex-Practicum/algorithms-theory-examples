function solve(array) {
    let maximal_sum = 0; // Сумма пустого префикса равна 0
    for (let i = 0; i < array.length; i++) {
        let current_sum = array.slice(0, i + 1).reduce((a, b) => a + b, 0);
        if (maximal_sum < current_sum) {
            maximal_sum = current_sum;
        }
    }
    return maximal_sum;
}
