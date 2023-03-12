public List<Triple<Integer, Integer, Integer>> naiveSolution(int A, List<Integer> x) {
  int n = x.size();
  List<Triple<Integer, Integer, Integer>> triples = new ArrayList<>();
  for (int i1 = 0; i1 < n; i1++) {
    for (int i2 = i1 + 1; i2 < n; i2++) {
      for (int i3 = i2 + 1; i3 < n; i3++) {
        if (x.get(i1) + x.get(i2) + x.get(i3) == A) {
          triples.add(new Triple<>(x.get(i1), x.get(i2), x.get(i3)));
        }
      }
    }
  }
  return triples;
}
