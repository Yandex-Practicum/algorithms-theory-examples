package main

import "fmt"

func insertionSort(array []int) {
    for i := 1; i < len(array); i++ {
        itemToInsert := array[i]
        j := i
        for j > 0 && itemToInsert < array[j-1] {
            array[j] = array[j-1]
            j--
        }
        array[j] = itemToInsert
        fmt.Printf("step %d, sorted %d elements: %v\n", i, i+1, array)
    }
}

func main() {
    array := []int{4, 3, 2, 1}
    insertionSort(array)
}
