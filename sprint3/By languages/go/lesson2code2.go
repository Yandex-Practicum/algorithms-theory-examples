package main

import "fmt"

func stairsBuilder(n int) {
    if n == 0 {
        return
    }
    // build 1 step
    fmt.Printf("Осталось построить %d ступеней.\n", n)
    stairsBuilder(n - 1)
}

func main() {
    stairsBuilder(5)
}
