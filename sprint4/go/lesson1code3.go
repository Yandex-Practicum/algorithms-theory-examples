package main

import "fmt"

func main() {
    fruits := []string{"яблоко", "яблоко", "груша", "яблоко", "слива"}
    fruitCount := make(map[string]int)
    for _, fruit := range fruits {
        if _, ok := fruitCount[fruit]; !ok {
            fruitCount[fruit] = 0
        }
        fruitCount[fruit]++
    }

    for fruit, count := range fruitCount {
        fmt.Printf("%v: %v\n", fruit, count)
    }
}
