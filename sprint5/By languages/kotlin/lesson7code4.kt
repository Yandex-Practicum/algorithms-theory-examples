fun bigLeftRotation(v: Node): Node {
    // Правым ребенком становится новый корень правого поддерева.
    v.right = smallRightRotation(v.right)
    // Возвращаем новый корень поддерева.
    return smallLeftRotation(v)
}
