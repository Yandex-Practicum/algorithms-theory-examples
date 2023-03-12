Node BigLeftRotation(Node v) {
    // Правым ребёнком становится новый корень правого поддерева.
    v.right = SmallRightRotation(v.right);
    // Возвращаем новый корень поддерева.
    return SmallLeftRotation(v);
}
