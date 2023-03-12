Stack<Integer> order = new Stack<>();
int[] color = new int[n];

void topSort(int v) {
    color[v] = 1;
    for (int w : adjList[v]) {
        if (color[w] == 0) {
            topSort(w);
        }
    }
    color[v] = 2;
    order.push(v);
}

void mainTopSort() {
    for (int i = 0; i < n; i++) {
        if (color[i] == 0) {
            topSort(i);
        }
    }
}
