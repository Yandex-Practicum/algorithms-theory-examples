#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>

using namespace std;

pair<int, pair<int, int>> escapeFromMaze(int n, int m, vector<vector<int>>& field, pair<int, int>& start_point) {
    vector<vector<int>> prev(n, vector<int>(m, -1)); // предок вершины
    vector<vector<int>> dist(n, vector<int>(m, n * m + 10)); // массив расстояний
    queue<pair<int, int>> q; // очередь для BFS

    int dx[] = {1, 0, -1, 0}; // возможные смещения по горизонтали
    int dy[] = {0, 1, 0, -1}; // возможные смещения по вертикали

    q.push(start_point);
    dist[start_point.first][start_point.second] = 0;

    while (!q.empty()) {
        auto currentPoint = q.front();
        q.pop();

        for (int i = 0; i < 4; i++) {
            int new_i = currentPoint.first + dx[i];
            int new_j = currentPoint.second + dy[i];
            if (new_i >= 0 && new_i < n && new_j >= 0 && new_j < m && field[new_i][new_j] != 1 && dist[new_i][new_j] == n * m + 10) {
                q.push({new_i, new_j});
                prev[new_i][new_j] = currentPoint.first * m + currentPoint.second;
                dist[new_i][new_j] = dist[currentPoint.first][currentPoint.second] + 1;
                if (field[new_i][new_j] == 2) {
                    return {dist[new_i][new_j], {new_i, new_j}};
                }
            }
        }
    }

    return {n * m + 10, {-1, -1}};
}
