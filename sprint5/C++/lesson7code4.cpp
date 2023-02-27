Node* big_left_rotation(Node* v) {
    // Правым ребёнком становится новый корень правого поддерева.
    v->right = small_right_rotation(v->right);
    // Возвращаем новый корень поддерева.
    return small_left_rotation(v);
}
