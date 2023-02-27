var color = []string{"white", "white", ...}
var time = 0
var entry = []*int{nil, nil, ...}
var leave = []*int{nil, nil, ...}

func DFS(v int) {
    time += 1 // При входе в вершину время (номер шага) увеличивается.
    entry[v] = &time // Запишем время входа.
    color[v] = "gray"
    for _, w := range getOutgoingEdges(v) {
        if color[w] == "white" {
            DFS(w)
        }
    }
    time += 1 // Перед выходом из вершины время снова обновляется.
    leave[v] = &time // Запишем время выхода.
    color[v] = "black"
}
