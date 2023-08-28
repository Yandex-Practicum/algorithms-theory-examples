def findKth(root, k):
    # Вычисляем размер левого поддерева с учётом того,
    # что оно может быть пустым.
    leftSize = 0 if root.left is None else root.left.size
    # Если слева ровно k вершин, то искомая вершина - корень.
    if leftSize == k:
        return root.value
    # Если левое поддерево слишком мало, то продолжим
    # поиск в правом поддереве.
    if leftSize < k:
        return findKth(root.right, k - leftSize - 1)
    # Иначе продолжим поиск в левом поддереве.
    return findKth(root.left, k)
