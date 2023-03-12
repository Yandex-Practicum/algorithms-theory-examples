val order = Stack<Int>() // В этом стеке будет записан порядок обхода.
val color = Array(size = n) { white }

fun topSort(v: Int) {
    color[v] = gray
    for (w in adjList[v]) {
        if (color[w] == white) {
            topSort(w)
        }
    }
    color[v] = black
    order.push(v) // Кладём обработанную вершину в стек.
}

fun mainTopSort() {
    for (i in 0 until n) {
        if (color[i] == white) {
            topSort(i)
        }
    }
}
