def print_forward(vertex):
  print(vertex.value)
  for child in vertex.children:
    print_forward(child)

