fun compare(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }

    val length = first.length
    for (i in 0 until length) {
        if (first[i] != second[i]) {
            return false
        }
    }

    return true
}
