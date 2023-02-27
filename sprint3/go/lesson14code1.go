func countingSort(array []int, k int) []int {
	countedValues := make([]int, k)
	for _, value := range array {
		countedValues[value]++
	}

	index := 0
	for value := 0; value < k; value++ {
		for amount := 0; amount < countedValues[value]; amount++ {
			array[index] = value
			index++
		}
	}
	return array
}
