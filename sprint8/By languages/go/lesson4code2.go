func findAll(text string, pattern string) []int {
    occurrences := []int{}
    start := 0
    for {
        pos := find(text, pattern, start)
        if pos == -1 {
            break
        }
        occurrences = append(occurrences, pos)
        start = pos + 1
    }
    return occurrences
}
