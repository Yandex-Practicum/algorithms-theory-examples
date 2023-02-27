def get_node_by_index(node, index):
		while index:
				node = node.next
				index -= 1
		return node

def insert_node(head, index, value):
		new_node = Node(value)
		if index == 0:
				new_node.next = head
				return new_node
		previous_node = get_node_by_index(head, index-1)
		new_node.next = previous_node.next 
		previous_node.next = new_node
		return head
>>> node, index, value = n1, 2, 'new_node'
>>> head = insert_node(node, index, value)
>>> print_linked_list(head)
first -> second -> new_node -> third -> None
