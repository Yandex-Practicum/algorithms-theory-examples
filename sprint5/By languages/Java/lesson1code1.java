import java.util.List;

public class Node {
    public int obj;
    public List<Node> children;
    
    public Node(int obj, List<Node> children) {
        this.obj = obj;
        this.children = children;
    }
    
    public Node(int obj) {
        this(obj, null);
    }
}
