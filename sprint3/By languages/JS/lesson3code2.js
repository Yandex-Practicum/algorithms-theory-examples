function binarySearchDescending(arr, x, left, right) {
  if (right <= left) {
    return -1;
  }
  // промежуток не пуст
  const mid = Math.floor((left + right) / 2);
  if (arr[mid] === x) { // центральный элемент — искомый
    return mid;
  } else if (arr[mid] < x) { // искомый элемент больше центрального на этот раз все элементы больше центрального располаг


// изначально мы запускаем двоичный поиск на всей длине массива
const index = binarySearchDescending(arr, x, 0, arr.length);
