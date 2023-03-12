public static Node getNodeByIndex(Node node, int index) {
    while (index > 0) {
        node = node.next;
        index--;
    }
    return node;
}

public static Node insertNode(Node head, int index, Object value) {
    Node newNode = new Node(value);
    if (index == 0) {
        newNode.next = head;
        return newNode;
    }
    Node previousNode = getNodeByIndex(head, index-1);
    newNode.next = previousNode.next;
    previousNode.next = newNode;
    return head;
}

Node node = n1;
int index = 2;
String value = "new_node";
Node head = insertNode(node, index, value);
printLinkedList(head);
