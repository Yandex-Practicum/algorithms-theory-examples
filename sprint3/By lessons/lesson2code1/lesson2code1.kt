fun stairs_builder(n: Int) {
    // build 1 step
    println("Осталось построить $n ступеней.")
    stairs_builder(n - 1)
}
