#include <iostream>
#include <vector>
#include <string>
using namespace std;

vector<string> color = {"white", "white", ...};
int time = 0;
vector<int> entry = {0, 0, ...};
vector<int> leave = {0, 0, ...};

void DFS(int v) {
    time += 1;
    entry[v] = time;
    color[v] = "gray";
    for (int w : getOutgoingEdges(v)) {
        if (color[w] == "white") {
            DFS(w);
        }
    }
    time += 1;
    leave[v] = time;
    color[v] = "black";
}
