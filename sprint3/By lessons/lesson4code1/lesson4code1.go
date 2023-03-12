package main

import "fmt"

func main() {
    genBinary(3, "")
}

func genBinary(n int, prefix string) {
    if n == 0 {
        fmt.Println(prefix)
    } else {
        genBinary(n-1, prefix+"0")
        genBinary(n-1, prefix+"1")
    }
}
