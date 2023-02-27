// Длины массивов равны числу вершин|V|.
const color = new Array(V);
const previous = new Array(V);
const distance = new Array(V);

function BFS(s) {
    // Создадим очередь вершин и положим туда стартовую вершину.
    const planned = [s];
    color[s] = "gray";
    distance[s] = 0;
    while (planned.length > 0) {
        const u = planned.shift(); // Возьмём вершину из очереди.
        for (const v of adjList[u]) { // adjList - список смежности графа.
            if (color[v] === undefined) { // Серые и чёрные вершины уже
                // либо в очереди, либо обработаны.
                distance[v] = distance[u] + 1;
                previous[v] = u;
                color[v] = "gray";
                planned.push(v); // Запланируем посещение вершины.
            }
        }
        color[u] = "black"; // Теперь вершина считается обработанной.
    }
}

function ShortestPath(v) {
    // Класть вершины будем в стек, тогда
    // стартовая вершина окажется наверху стека
    // и порядок следования от s до v будет соответствовать
    // порядку извлечения вершин из стека.
    const path = [];
    let current_vertex = v;
    while (current_vertex !== null) { // Предшественник вершины s равен null.
        path.push(current_vertex);
        current_vertex = previous[current_vertex];
    }
    return path;
}
