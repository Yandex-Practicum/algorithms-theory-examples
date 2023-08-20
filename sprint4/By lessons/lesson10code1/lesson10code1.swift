func naiveSolution(_ A: Int, _ x: [Int]) -> [(Int, Int, Int)] {
    let n = x.count
    var triples: [(Int, Int, Int)] = []

    for i1 in 0..<n {
        for i2 in (i1 + 1)..<n {
            for i3 in (i2 + 1)..<n {
                if x[i1] + x[i2] + x[i3] == A {
                    triples.append((x[i1], x[i2], x[i3]))
                }
            }
        }
    }
    
    return triples
}