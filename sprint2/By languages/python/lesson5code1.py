class Node:
    def __init__(self, value=None, next=None):
        self.value = value
        self.next = next
        
def print_linked_list(vertex):
		while vertex:
				print(vertex.value, end=" -> ")
				vertex = vertex.next
		print("None")
		
>>> n3 = Node('third')
>>> n2 = Node('second', n3)
>>> n1 = Node('first', n2)
>>> print_linked_list(n1)
first -> second -> third -> None
>>> print_linked_list(n2)
second -> third -> None
