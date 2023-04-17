# Функция возвращает новый корень поддерева.
def rotate(vertex):
	if abs(vertex.left.height - vertex.right.height) < 2:
		# Вращать не надо, поддерево с вершиной vertex и так сбалансировано.	
		return vertex
	if (vertex.left.height - vertex.right.height == -2):
		# Нам нужны левые вращения.
		b = vertex.right
		R = b.right
		C = b.left
		
		if C.height <= R.height:
			# Нужно малое левое вращение.
			return small_left_rotation(vertex)
		else:
			# Нужно большое левое вращение.
			return big_left_rotation(vertex)

	if (vertex.left.height - vertex.right.height == 2):
		# Нам нужны правые вращения.
		b = vertex.left
		C = b.right
		L = b.left

		if C.height <= L.height:
			# Нужно малое правое вращение.
			return small_right_rotation(vertex)
		else:
			# Нужно большое правое вращение.
			return big_right_rotation(vertex)