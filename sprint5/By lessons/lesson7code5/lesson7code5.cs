Node rotate(Node vertex) {
    if (Math.Abs(GetHeight(vertex.left) - GetHeight(vertex.right)) < 2) {
        // Вращать не надо, поддерево с вершиной vertex и так сбалансировано.    
        return vertex;
    }
    if (GetHeight(vertex.left) - GetHeight(vertex.right) == -2) {
        // Нам нужны левые вращения.
        Node b = vertex.right;
        Node R = b.right;
        Node C = b.left;

        if (GetHeight(C) <= GetHeight(R)) {
            // Нужно малое левое вращение.
            return SmallLeftRotation(vertex);
        } else {
            // Нужно большое левое вращение.
            return BigLeftRotation(vertex);
        }
    }
    if (GetHeight(vertex.left) - GetHeight(vertex.right) == 2) {
        // Нам нужны правые вращения.
        Node b = vertex.left;
        Node C = b.right;
        Node L = b.left;

        if (GetHeight(C) <= GetHeight(L)) {
            // Нужно малое правое вращение.
            return SmallRightRotation(vertex);
        } else {
            // Нужно большое правое вращение.
            return BigRightRotation(vertex);
        }
    }
}
