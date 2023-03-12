using System;

public class Node {
    public Node Next;
    public int Value;
    
    public Node(int value) {
        Next = null;
        Value = value;
    }
}

public class LinkedList {
    public static void PrintLinkedList(Node node) {
        while (node != null) {
            Console.Write(node.Value + " -> ");
            node = node.Next;
        }
        Console.Write("None\n");
    }

    public static Node GetNodeByIndex(Node node, int index) {
        while (index > 0) {
            node = node.Next;
            index--;
        }
        return node;
    }

    public static Node InsertNode(Node head, int index, int value) {
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.Next = head;
            return newNode;
        }
        Node previousNode = GetNodeByIndex(head, index-1);
        newNode.Next = previousNode.Next;
        previousNode.Next = newNode;
        return head;
    }
}

class Program {
    static void Main(string[] args) {
        Node n3 = new Node(3);
        Node n2 = new Node(2);
        Node n1 = new Node(1);
        n1.Next = n2;
        n2.Next = n3;
        Node node = n1;
        int index = 2;
        int value = 4;
        Node head = LinkedList.InsertNode(node, index, value);
        LinkedList.PrintLinkedList(head);
    }
}
