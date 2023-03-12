type Node struct {
    obj      int
    children []*Node
}

func NewNode(obj int, children ...*Node) *Node {
    return &Node{obj: obj, children: children}
}
