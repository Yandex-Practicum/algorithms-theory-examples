// visitors - массив номеров пассажиров.
// Каждый пассажир проехал столько раз, сколько раз встречается его номер
val visitors = intArrayOf(0, 2, 3, 2, 0, 4, 1, 1, 2)
val entriesByVisitor = IntArray(5)
var bestVisitor = 0

for (visitor in visitors) {
    entriesByVisitor[visitor] += 1
    if (entriesByVisitor[visitor] > entriesByVisitor[bestVisitor]) {
        bestVisitor = visitor
    }
}

println(bestVisitor)
