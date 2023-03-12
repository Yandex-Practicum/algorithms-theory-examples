def find_node(root, value):
  # Если мы пришли в поддерево, а его не существует, значит, нужного элемента в дереве поиска нет
  if root is None: 
    return f"Значение {value} не найдено"
  if value < root.value:
    return find_node(root.left, value)
  if value = root.value:
    return root
  if value > root.value:
    return find_node(root.right, value)
