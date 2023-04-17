type Node struct {
    obj   int
    left  *Node
    right *Node
}

func NewNode(obj int, left, right *Node) *Node {
    return &Node{obj: obj, left: left, right: right}
}
