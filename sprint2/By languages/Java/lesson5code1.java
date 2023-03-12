class Node {
    public String value;
    public Node next;
    
    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }
    
    public Node(String value) {
        this(value, null);
    }
}

class Main {
    static void printLinkedList(Node vertex) {
        while (vertex != null) {
            System.out.print(vertex.value + " -> ");
            vertex = vertex.next;
        }
        System.out.println("None");
    }
    
    public static void main(String[] args) {
        Node n3 = new Node("third");
        Node n2 = new Node("second", n3);
        Node n1 = new Node("first", n2);
        printLinkedList(n1);
        printLinkedList(n2);
    }
}
