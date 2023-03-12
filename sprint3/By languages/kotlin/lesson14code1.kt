fun countingSort(array: IntArray, k: Int): IntArray {
  val countedValues = IntArray(k) { 0 }
  for (value in array) {
    countedValues[value]++
  }

  var index = 0
  for (value in 0 until k) {
    for (amount in 1..countedValues[value]) {
      array[index] = value
      index++
    }
  }
  return array
}
