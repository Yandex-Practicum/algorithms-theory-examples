class Node {
    public int key;
    public int height;
    public Node left;
    public Node right;

    public Node(int k, int h=1, Node l=null, Node r=null) {
        key = k;
        height = h;
        left = l;
        right = r;
    }
}
