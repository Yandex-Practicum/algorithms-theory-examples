function small_left_rotation(a) {
  // Задаём обозначения.
  const b = a.right;
  const C = b.left;

  // Переусыновляем вершины.
  a.right = C;
  b.left = a;

  // Корректируем высоты в зависимости от того, равны ли высоты C и R.
  if (C.height === a.height) {
    a.height -= 1;
    b.height += 1;
  } else {
    a.height -= 2;
  }
  return b;
}
