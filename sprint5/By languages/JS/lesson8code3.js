function bigLeftRotation(a) {
  const b = a.right;
  const c = b.left;
  const M = c.left;
  const N = c.right;

  a.right = M;
  b.left = N;
  c.left = a;
  c.right = b;

  a.height -= 2;
  b.height -= 1;
  c.height += 1;
  return c;
}
