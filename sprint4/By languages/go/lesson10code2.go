func effectiveSolution(A int, x []int) map[[3]int]bool {
    history := make(map[int]bool)
    n := len(x)
    xSorted := make([]int, n)
    copy(xSorted, x)
    sort.Ints(xSorted)
    triples := make(map[[3]int]bool)
    for i := 0; i < n; i++ {
        for j := i + 1; j < n; j++ {
            target := A - xSorted[i] - xSorted[j]
            if history[target] {
                triples[[3]int{target, xSorted[i], xSorted[j]}] = true
            }
            history[xSorted[i]] = true
        }
    }
    return triples
}
