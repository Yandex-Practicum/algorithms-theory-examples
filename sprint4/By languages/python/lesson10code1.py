def naive_solution(A, x):
    n = len(x)
    triples = []
    for i1 in range(n):
        for i2 in range(i1 + 1, n):
            for i3 in range(i2 + 1, n):
                if x[i1] + x[i2] + x[i3] == A:
                    triples.append((x[i1], x[i2], x[i3]))
    return triples
