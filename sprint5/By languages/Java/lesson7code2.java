Node small_left_rotation(Node a) {
  // Задаём обозначения.
  Node b = a.right;
  Node C = b.left;

  // Переусыновляем вершины.
  a.right = C;
  b.left = a;

  // Корректируем высоты в зависимости от того, равны ли высоты C и R.
  if (C.height == a.height) {
    a.height -= 1;
    b.height += 1;
  } else {
    a.height -= 2;
  }
  return b;
}
