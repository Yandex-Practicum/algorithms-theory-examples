List<String> color = new ArrayList<>(Arrays.asList("white", "white", ...));
int time = 0;
List<Integer> entry = new ArrayList<>(Arrays.asList(null, null, ...));
List<Integer> leave = new ArrayList<>(Arrays.asList(null, null, ...));

void DFS(int v) {
    time += 1;
    entry.set(v, time);
    color.set(v, "gray");
    for (int w : getOutgoingEdges(v)) {
        if (color.get(w).equals("white")) {
            DFS(w);
        }
    }
    time += 1;
    leave.set(v, time);
    color.set(v, "black");
}
