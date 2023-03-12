func naive_solution(A int, x []int) []Triple {
    n := len(x)
    triples := make([]Triple, 0)
    for i1 := 0; i1 < n; i1++ {
        for i2 := i1 + 1; i2 < n; i2++ {
            for i3 := i2 + 1; i3 < n; i3++ {
                if x[i1]+x[i2]+x[i3] == A {
                    triples = append(triples, Triple{x[i1], x[i2], x[i3]})
                }
            }
        }
    }
    return triples
}
