package main

import "fmt"

func factorial(n int) int {
    accumulator := 1
    i := n
    for i > 1 {
        accumulator *= i
        i -= 1
    }
    return accumulator
}

func main() {
    fmt.Println(factorial(5))   // 120
}
