struct Triple: Hashable {
    let first: Int
    let second: Int
    let third: Int
}

func effectiveSolution(_ A: Int, _ x: [Int]) -> Set<Triple> {
    var history: Set<Int> = []
    let n = x.count
    let xSorted = x.sorted()
    var triples: Set<Triple> = []

    for i in 0..<n {
        for j in (i + 1)..<n {
            let target = A - xSorted[i] - xSorted[j]
            if history.contains(target) {
                let triple = Triple(first: target, second: xSorted[i], third: xSorted[j])
                triples.insert(triple)
            }
            history.insert(xSorted[i])
        }
    }

    return triples
}
