func compare(first, second string) bool {
    if len(first) != len(second) {
        return false
    }

    length := len(first)
    for i := 0; i < length; i++ {
        if first[i] != second[i] {
            return false
        }
    }

    return true
}
