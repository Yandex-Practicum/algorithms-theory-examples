func find(text string, pattern string, start int) int {
    if len(text) < len(pattern) {
        return -1
    }
    for pos := start; pos <= len(text)-len(pattern); pos++ {
        match := true
        for offset := 0; offset < len(pattern); offset++ {
            if text[pos+offset] != pattern[offset] {
                match = false
                break
            }
        }
        if match == true {
            return pos
        }
    }
    return -1
}
