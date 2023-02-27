# Вставить строку substring в строку string перед позицией index.
def insert(string: str, index: int, substring: str) -> str:
	length = len(string)
	shift = len(substring)
	if index > length:
		# index == length - край строки
		raise ValueError("Нет такой позиции")
	string = string.ljust(length + shift)
	if length > 0:
		# Если length == 0, делать сдвиг нет смысла.
		# Кроме того, не следует в вычислениях писать (length - 1),
		# не проверив, что индекс не ноль.
		# В некоторых языках длина представляется беззнаковым целым числом,
		# в таком случае (length - 1) будет равен не -1, а числу MAX_INT,
		# и цикл станет некорректным. Мы этого избегаем.
		for i in range(length - 1, index - 1, -1):
			string = string[:i + shift] + string[i]
	for i in range(shift):
		string = string[:index + i] + substring[i] + string[index + i + 1:]
	return string