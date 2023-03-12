List<Tuple<int, int, int>> naive_solution(int A, List<int> x) {
    int n = x.Count;
    List<Tuple<int, int, int>> triples = new List<Tuple<int, int, int>>();
    for (int i1 = 0; i1 < n; ++i1) {
        for (int i2 = i1 + 1; i2 < n; ++i2) {
            for (int i3 = i2 + 1; i3 < n; ++i3) {
                if (x[i1] + x[i2] + x[i3] == A) {
                    triples.Add(Tuple.Create(x[i1], x[i2], x[i3]));
                }
            }
        }
    }
    return triples;
}
