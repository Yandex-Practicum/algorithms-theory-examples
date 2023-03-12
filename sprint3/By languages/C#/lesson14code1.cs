public static int[] CountingSort(int[] array, int k) {
    int[] countedValues = new int[k];
    foreach (int value in array) {
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
