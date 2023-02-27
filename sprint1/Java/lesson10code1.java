public static int solve(List<Integer> array) {
    int maximalSum = 0; // Сумма пустого префикса равна 0
    for (int i = 0; i < array.size(); i++) {
        int currentSum = 0;
        for (int j = 0; j <= i; j++) {
            currentSum += array.get(j);
        }
        if (maximalSum < currentSum) {
            maximalSum = currentSum;
        }
    }
    return maximalSum;
}
