type Node struct {
    key    int
    height int
    left   *Node
    right  *Node
}

func NewNode(k int, h int, l *Node, r *Node) *Node {
    return &Node{key: k, height: h, left: l, right: r}
}

func NewNode(k int) *Node {
    return NewNode(k, 1, nil, nil)
}
