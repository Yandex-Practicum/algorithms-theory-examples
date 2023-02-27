public static boolean[] eratosthenesEffective(int n) {
    boolean[] numbers = new boolean[n + 1];
    Arrays.fill(numbers, true);
    numbers[0] = false;
    numbers[1] = false;
    for (int num = 2; num < n; num++) {
        if (numbers[num]) {
            for (int j = num * num; j < n + 1; j += num) {
                numbers[j] = false;
            }
        }
    }
    return numbers;
}
