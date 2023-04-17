public Node bigLeftRotation(Node v) {
    // Правым ребёнком становится новый корень правого поддерева.
    v.right = smallRightRotation(v.right);
    // Возвращаем новый корень поддерева.
    return smallLeftRotation(v);
}
