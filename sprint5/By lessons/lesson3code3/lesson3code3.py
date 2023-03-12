def print_LMR(vertex):
  if not vertex.left is None:
    print_LMR(vertex.left)
  print(vertex.value)
  if not vertex.right is None:
    return print_LMR(vertex.right)