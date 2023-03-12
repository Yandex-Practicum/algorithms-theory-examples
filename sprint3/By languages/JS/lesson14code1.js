function countingSort(array, k) {
  const countedValues = new Array(k).fill(0);
  for (const value of array) {
    countedValues[value]++;
  }

  let index = 0;
  for (let value = 0; value < k; value++) {
    for (let amount = 0; amount < countedValues[value]; amount++) {
      array[index] = value;
      index++;
    }
  }
  return array;
}
