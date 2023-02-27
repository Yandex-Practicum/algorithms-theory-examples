void relax(int u, int v) {
    
    if (dist[v] > dist[u] + weight(u, v)) {
        dist[v] = dist[u] + weight(u, v);
        previous[v] = u;
    }
}

Integer getMinDistNotVisitedVertex() {
    
    Integer currentMinimum = Integer.MAX_VALUE;
    Integer currentMinimumVertex = null;

    for (int v : graph.vertices) {
        if (!visited[v] && dist[v] < currentMinimum) {
            currentMinimum = dist[v];
            currentMinimumVertex = v;
        }
    }
    return currentMinimumVertex;
}

void dijkstra(Graph graph, int s) {
    for (int v : graph.vertices) {
        dist[v] = Integer.MAX_VALUE; 
        previous[v] = null;
        visited[v] = false;
    }

    dist[s] = 0; 

    while (true) {
        Integer u = getMinDistNotVisitedVertex();

        if (u == null || dist[u] == Integer.MAX_VALUE) {
            break;
        }

        visited[u] = true;
        
        ArrayList<Pair<Integer, Integer>> neighbours = graph.outgoingEdges(u);

        for (Pair<Integer, Integer> pair : neighbours) {
            int v = pair.getValue();
            relax(u, v);
        }
    }
}
