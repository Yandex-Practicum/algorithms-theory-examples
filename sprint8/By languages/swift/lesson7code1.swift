func search(p: String, text: String) -> [Int] {
    var result = [Int]()
    let s = p + "#" + text
    var π = [Int](repeating: 0, count: p.count)
    var πPrev = 0
    
    let sChars = Array(s)
    let pChars = Array(p)
    
    for i in 1..<s.count {
        var k = πPrev
        while k > 0 && sChars[k] != sChars[i] {
            k = π[k-1]
        }
        if sChars[k] == sChars[i] {
            k += 1
        }
        if i < p.count {
            π[i] = k
        }
        πPrev = k
        if k == p.count {
            result.append(i - 2 * p.count)
        }
    }
    
    return result
}
