var minimumSpanningTree = mutableListOf<Edge>()  // Рёбра, составляющие MST.

val added = mutableSetOf<Vertex>()  // Множество вершин, уже добавленных в остов.
val notAdded = mutableSetOf<Vertex>()  // Множество вершин, ещё не добавленных в остов.
val edges = mutableListOf<Edge>()  // Массив рёбер, исходящих из остовного дерева.

fun addVertex(v: Vertex) {
    added += v
    notAdded -= v
    // Добавляем все рёбра, которые инцидентны v, но их конец ещё не в остове.
    //
    // Вершины notAdded стоит хранить в таком контейнере,
    // чтобы проверка (end in notAdded) выполнялась эффективно.
    //
    // Для этого подойдёт, например, хеш-таблица.
    // Также в некоторых языках программирования имеется контейнер set.
    edges += graph.edges.filter { it.start == v && it.end in notAdded }
}

fun findMST(graph: Graph): List<Edge> {
    notAdded.addAll(graph.vertices)

    // Берём первую попавшуюся вершину.
    val v = graph.vertices[0]
    addVertex(v)

    while (notAdded.isNotEmpty() && edges.isNotEmpty()) {
        // Подразумеваем, что extractMinimum извлекает минимальное ребро
        // из массива рёбер и больше данного ребра в массива не будет.
        val e = extractMinimum(edges)
        if (e.end in notAdded) {
            minimumSpanningTree += e
            addVertex(e.end)
        }
    }

    return if (notAdded.isNotEmpty()) {
        error("Исходный граф несвязный")
    } else {
        minimumSpanningTree
    }
}
