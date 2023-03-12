fun naive_solution(A: Int, x: List<Int>): List<Triple<Int, Int, Int>> {
  val n = x.size
  val triples = mutableListOf<Triple<Int, Int, Int>>()
  for (i1 in 0 until n) {
    for (i2 in i1 + 1 until n) {
      for (i3 in i2 + 1 until n) {
        if (x[i1] + x[i2] + x[i3] == A) {
          triples.add(Triple(x[i1], x[i2], x[i3]))
        }
      }
    }
  }
  return triples
}
