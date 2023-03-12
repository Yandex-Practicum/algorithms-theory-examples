fun genBinary(n: Int, prefix: String) {
    if (n == 0) {
        println(prefix)
    } else {
        genBinary(n - 1, prefix + "0")
        genBinary(n - 1, prefix + "1")
    }
}
