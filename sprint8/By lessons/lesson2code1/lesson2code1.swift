func compare(first: [Character], second: [Character]) -> Bool {
    if first.count != second.count {
        return false
    }

    let length = first.count
    for i in 0..<length {
        if first[i] != second[i] {
            return false
        }
    }

    return true
}
