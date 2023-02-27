def insert_node(root, key):
  if key < root.key: 
	  if root.left is None:
      root.left = Node(key)
    else:
      insert_node(root.left, key)
  if key >= root.key:
	  if root.right is None:
      root.right = Node(key)
    else:
      insert_node(root.right, key) 

