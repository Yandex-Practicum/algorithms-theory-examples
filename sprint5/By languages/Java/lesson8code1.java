class Node {
    int key;
    int height;
    Node left;
    Node right;

    public Node(int k, int h, Node l, Node r) {
        key = k;
        height = h;
        left = l;
        right = r;
    }

    public Node(int k) {
        this(k, 1, null, null);
    }
}
