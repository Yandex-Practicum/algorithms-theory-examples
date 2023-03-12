using System;

class Node {
    public string value;
    public Node next;
    
    public Node(string value = null, Node next = null) {
        this.value = value;
        this.next = next;
    }
}

class Program {
    static void PrintLinkedList(Node vertex) {
        while (vertex != null) {
            Console.Write($"{vertex.value} -> ");
            vertex = vertex.next;
        }
        Console.WriteLine("None");
    }
    
    static void Main() {
        Node n3 = new Node("third");
        Node n2 = new Node("second", n3);
        Node n1 = new Node("first", n2);
        PrintLinkedList(n1);
        PrintLinkedList(n2);
    }
}
