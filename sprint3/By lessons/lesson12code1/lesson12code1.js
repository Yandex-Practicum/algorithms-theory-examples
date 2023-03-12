function partition(array, pivot) {
  let left = [], center = [], right = [];
  for (let x of array) {
    if (x < pivot) {
      left.push(x);
    } else if (x === pivot) {
      center.push(x);
    } else {
      right.push(x);
    }
  }
  return [left, center, right];
}

function quicksort(array) {
  if (array.length < 2) {
    return array; // массивы с 0 или 1 элементами фактически отсортированы
  } else {
    let pivot = array[Math.floor(Math.random() * array.length)];
    let [left, center, right] = partition(array, pivot);
    return quicksort(left).concat(center).concat(quicksort(right));
  }
}
