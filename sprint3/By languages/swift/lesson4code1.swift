func genBinary(n: Int, prefix: String) {
    if n == 0 {
        print(prefix)
    } else {
        genBinary(n: n - 1, prefix: prefix + "0")
        genBinary(n: n - 1, prefix: prefix + "1")
    }
}

genBinary(n: 3, prefix: "")
