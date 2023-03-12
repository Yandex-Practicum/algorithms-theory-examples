def big_left_rotation(a):
  # Задаём обозначения.
  b = a.right
  c = b.left
  M = c.left
  N = c.right

  # Переусыновляем вершины.
  a.right = M
  b.left = N
  c.left = a
  c.right = b

  # Корректируем высоты. 
  a.height -= 2
  b.height -= 1
  c.height += 1

  # Возвращаем новый корень.
  return c
