Node rotate(Node vertex) {
    if (Math.abs(getHeight(vertex.left) - getHeight(vertex.right)) < 2) {
        // Вращать не надо, поддерево с вершиной vertex и так сбалансировано.    
        return vertex;
    }
    if (getHeight(vertex.left) - getHeight(vertex.right) == -2) {
        // Нам нужны левые вращения.
        Node b = vertex.right;
        Node R = b.right;
        Node C = b.left;

        if (getHeight(C) <= getHeight(R)) {
            // Нужно малое левое вращение.
            return smallLeftRotation(vertex);
        } else {
            // Нужно большое левое вращение.
            return bigLeftRotation(vertex);
        }
    }
    if (getHeight(vertex.left) - getHeight(vertex.right) == 2) {
        // Нам нужны правые вращения.
        Node b = vertex.left;
        Node C = b.right;
        Node L = b.left;

        if (getHeight(C) <= getHeight(L)) {
            // Нужно малое правое вращение.
            return smallRightRotation(vertex);
        } else {
            // Нужно большое правое вращение.
            return bigRightRotation(vertex);
        }
    }
}
