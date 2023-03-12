public static int[] countingSort(int[] array, int k) {
    int[] countedValues = new int[k];
    for (int value : array) {
        countedValues[value]++;
    }

    int index = 0;
    for (int value = 0; value < k; value++) {
        for (int amount = 0; amount < countedValues[value]; amount++) {
            array[index] = value;
            index++;
        }
    }
    return array;
}
