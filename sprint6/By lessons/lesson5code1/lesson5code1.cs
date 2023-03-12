using System;
using System.Collections.Generic;

List<string> color = new List<string> {"white", "white", ...};
int time = 0;
List<int?> entry = new List<int?> {null, null, ...};
List<int?> leave = new List<int?> {null, null, ...};

void DFS(int v) {
    time += 1;
    entry[v] = time;
    color[v] = "gray";
    foreach (int w in getOutgoingEdges(v)) {
        if (color[w] == "white") {
            DFS(w);
        }
    }
    time += 1;
    leave[v] = time;
    color[v] = "black";
}
