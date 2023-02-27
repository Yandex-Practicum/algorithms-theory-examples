func Search(p, text string) []int {
    var result []int
    s := p + "#" + text
    π := make([]int, len(p))
    var πPrev int
    for i := 1; i < len(s); i++ {
        k := πPrev
        for k > 0 && s[k] != s[i] {
            k = π[k-1]
        }
        if s[k] == s[i] {
            k++
        }
        if i < len(p) {
            π[i] = k
        }
        πPrev = k
        if k == len(p) {
            result = append(result, i-2*len(p))
        }
    }
    return result
}
