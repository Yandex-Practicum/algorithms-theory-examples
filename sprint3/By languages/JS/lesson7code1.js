function insertionSort(array) {
  for (let i = 1; i < array.length; i++) {
    let item_to_insert = array[i];
    let j = i;
    while (j > 0 && item_to_insert < array[j - 1]) {
      array[j] = array[j - 1];
      j--;
    }
    array[j] = item_to_insert;
    console.log(`step ${i}, sorted ${i + 1} elements: ${array.slice(0, i + 1).join(" ")}`);
  }
}

let array = [5, 2, 4, 6, 1, 3];
insertionSort(array);
