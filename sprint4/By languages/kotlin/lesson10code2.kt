fun effectiveSolution(A: Int, x: List<Int>): Set<Triple<Int, Int, Int>> {
    val history = HashSet<Int>()
    val n = x.size
    val xSorted = x.sorted()
    val triples = HashSet<Triple<Int, Int, Int>>()
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            val target = A - xSorted[i] - xSorted[j]
            if (target in history) {
                // Заметим, что тут тройка уже отсортирована за счёт предварительной
                // сортировки всего массива.
                triples.add(Triple(target, xSorted[i], xSorted[j]))
            }
            history.add(xSorted[i])
        }
    }
    return triples
}