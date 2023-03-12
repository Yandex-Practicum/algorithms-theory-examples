let order = [];
let color = new Array(n).fill(0);

function topSort(v) {
    color[v] = 1;
    for (let w of adjList[v]) {
        if (color[w] == 0) {
            topSort(w);
        }
    }
    color[v] = 2;
    order.push(v);
}

function mainTopSort() {
    for (let i = 0; i < n; i++) {
        if (color[i] == 0) {
            topSort(i);
        }
    }
}
