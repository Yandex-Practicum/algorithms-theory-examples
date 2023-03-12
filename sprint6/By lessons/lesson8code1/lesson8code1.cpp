#include <iostream>
#include <queue>
#include <stack>
#include <vector>
using namespace std;

const int V = 100; // число вершин графа

vector<int> adjList[V];
string color[V];
int previous[V];
int distance[V];

void BFS(int s) {
    queue<int> planned;
    planned.push(s);
    color[s] = "gray";
    distance[s] = 0;
    while (!planned.empty()) {
        int u = planned.front();
        planned.pop();
        for (int i = 0; i < adjList[u].size(); i++) {
            int v = adjList[u][i];
            if (color[v] == "") {
                distance[v] = distance[u] + 1;
                previous[v] = u;
                color[v] = "gray";
                planned.push(v);
            }
        }
        color[u] = "black";
    }
}

stack<int> ShortestPath(int v) {
    stack<int> path;
    int current_vertex = v;
    while (current_vertex != -1) {
        path.push(current_vertex);
        current_vertex = previous[current_vertex];
    }
    return path;
}

int main() {
    // add edges to adjList
    BFS(0);
    stack<int> path = ShortestPath(4);
    while (!path.empty()) {
        cout << path.top() << " ";
        path.pop();
    }
    cout << endl;
    return 0;
}
