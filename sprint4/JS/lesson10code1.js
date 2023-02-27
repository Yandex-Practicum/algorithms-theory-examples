function naiveSolution(A, x) {
  const n = x.length;
  const triples = [];
  for (let i1 = 0; i1 < n; i1++) {
    for (let i2 = i1 + 1; i2 < n; i2++) {
      for (let i3 = i2 + 1; i3 < n; i3++) {
        if (x[i1] + x[i2] + x[i3] === A) {
          triples.push([x[i1], x[i2], x[i3]]);
        }
      }
    }
  }
  return triples;
}
