func getNodeByIndex(node *Node, index int) *Node {
	for index > 0 {
		node = node.Next
		index--
	}
	return node
}

func insertNode(head *Node, index int, value interface{}) *Node {
	newNode := &Node{Value: value}
	if index == 0 {
		newNode.Next = head
		return newNode
	}
	previousNode := getNodeByIndex(head, index-1)
	newNode.Next = previousNode.Next
	previousNode.Next = newNode
	return head
}

node, index, value := n1, 2, "new_node"
head := insertNode(node, index, value)
printLinkedList(head)
