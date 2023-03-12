def effectiveSolution(A, x):
    history = set()
    n = len(x)
    xSorted = sorted(x)
    triples = set()
    for i in range(n):
        for j in range(i + 1, n):
            target = A - xSorted[i] - xSorted[j]
            if target in history:
                triples.add((target, xSorted[i], xSorted[j]))
            history.add(xSorted[i])
    return triples
