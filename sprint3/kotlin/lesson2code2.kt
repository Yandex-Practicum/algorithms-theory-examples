fun stairs_builder(n: Int) {
    if (n == 0) return
    // build 1 step
    println("Осталось построить $n ступеней.")
    stairs_builder(n - 1)
}
