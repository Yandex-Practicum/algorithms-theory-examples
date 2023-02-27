let color = ["white", "white", ...];
let time = 0;
let entry = [null, null, ...];
let leave = [null, null, ...];

function DFS(v) {
    time += 1;
    entry[v] = time;
    color[v] = "gray";
    for (let w of getOutgoingEdges(v)) {
        if (color[w] === "white") {
            DFS(w);
        }
    }
    time += 1;
    leave[v] = time;
    color[v] = "black";
}
