using System.Collections.Generic;

public class Node {
    public int Obj { get; set; }
    public List<Node> Children { get; set; }
    
    public Node(int obj, List<Node> children = null) {
        Obj = obj;
        Children = children ?? new List<Node>();
    }
}
