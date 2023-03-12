var color = mutableListOf<String>("white", "white", ...)
var time = 0
var entry = mutableListOf<Int?>(null, null, ...)
var leave = mutableListOf<Int?>(null, null, ...)

fun DFS(v: Int) {
    time += 1  // При входе в вершину время (номер шага) увеличивается.
    entry[v] = time  // Запишем время входа.
    color[v] = "gray"
    for (w in getOutgoingEdges(v)) {
        if (color[w] == "white") {
            DFS(w)
        }
    }
    time += 1  // Перед выходом из вершины время снова обновляется.
    leave[v] = time  // Запишем время выхода.
    color[v] = "black"
}