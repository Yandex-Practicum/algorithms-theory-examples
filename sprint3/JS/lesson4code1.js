function genBinary(n, prefix) {
    if (n == 0) {
        console.log(prefix);
    } else {
        genBinary(n - 1, prefix + "0");
        genBinary(n - 1, prefix + "1");
    }
}

genBinary(3, "");
