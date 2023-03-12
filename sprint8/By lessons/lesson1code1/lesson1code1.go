func insert(s, sub string, index int) (string, error) {
	length := len(s)
	shift := len(sub)
	if index > length {
		// index == length - край строки
		return "", errors.New("Нет такой позиции")
	}
	s = s + strings.Repeat(" ", length+shift-len(s))
	if length > 0 {
		// Если length == 0, делать сдвиг нет смысла.
		// Кроме того, не следует в вычислениях писать (length - 1),
		// не проверив, что индекс не ноль.
		// В некоторых языках длина представляется беззнаковым целым числом,
		// в таком случае (length - 1) будет равен не -1, а числу MAX_INT,
		// и цикл станет некорректным. Мы этого избегаем.
		for i := length - 1; i >= index; i-- {
			s = s[:i+shift] + string(s[i]) + s[i+shift+1:]
		}
	}
	for i := 0; i < shift; i++ {
		s = s[:index+i] + string(sub[i]) + s[index+i+1:]
	}
	return s, nil
}
