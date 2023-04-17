func bigLeftRotation(a *Node) *Node {
  b := a.right
  c := b.left
  M := c.left
  N := c.right

  a.right = M
  b.left = N
  c.left = a
  c.right = b

  a.height -= 2
  b.height -= 1
  c.height += 1
  return c
}
