// visitors - массив номеров пассажиров.
// Каждый пассажир проехал столько раз, сколько раз встречается его номер
var visitors = [0, 2, 3, 2, 0, 4, 1, 1, 2]
var entriesByVisitor = Array(repeating: 0, count: 5)
var bestVisitor = 0

for visitor in visitors {
    entriesByVisitor[visitor] += 1
    if entriesByVisitor[visitor] > entriesByVisitor[bestVisitor] {
        bestVisitor = visitor
    }
}

print(bestVisitor)