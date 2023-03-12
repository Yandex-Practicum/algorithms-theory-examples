using System.Collections.Generic;

Stack<int> order = new Stack<int>(); // В этом стеке будет записан порядок обхода.
int[] color = new int[n];

void topSort(int v) {
    color[v] = gray;
    foreach (int w in adjList[v]) {
        if (color[w] == white) {
            topSort(w);
        }
    }
    color[v] = black;
    order.Push(v); // Кладём обработанную вершину в стек.
}

void mainTopSort() {
    for (int i = 0; i < n; i++) {
        if (color[i] == white) {
            topSort(i);
        }
    }
}
