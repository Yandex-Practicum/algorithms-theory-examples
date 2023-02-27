#include <stack>
#include <vector>

std::stack<int> order; // В этом стеке будет записан порядок обхода.
std::vector<int> color(n, white);

void topSort(int v) {
    color[v] = gray;
    for (int w : adjList[v]) {
        if (color[w] == white) {
            topSort(w);
        }
    }
    color[v] = black;
    order.push(v); // Кладём обработанную вершину в стек.
}

void mainTopSort() {
    for (int i = 0; i < n; i++) {
        if (color[i] == white) {
            topSort(i);
        }
    }
}
