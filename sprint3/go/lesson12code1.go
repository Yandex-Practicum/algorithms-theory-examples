package main

import (
    "math/rand"
)

func partition(array []int, pivot int) ([]int, []int, []int) {
    var left []int
    var center []int
    var right []int

    for _, x := range array {
        if x < pivot {
            left = append(left, x)
        } else if x == pivot {
            center = append(center, x)
        } else {
            right = append(right, x)
        }
    }

    return left, center, right
}

func quicksort(array []int) []int {
    if len(array) < 2 {
        return array
    } else {
        pivot := array[rand.Intn(len(array))]
        left, center, right := partition(array, pivot)
        return append(append(quicksort(left), center...), quicksort(right)...)
    }
}

func main() {
    array := []int{5, 2, 7, 3, 9, 1, 8, 6, 4}
    sorted := quicksort(array)
    fmt.Println(sorted)
}
