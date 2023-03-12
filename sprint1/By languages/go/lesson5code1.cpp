// visitors - массив номеров пассажиров.
// Каждый пассажир проехал столько раз, сколько раз встречается его номер
visitors := []int{0, 2, 3, 2, 0, 4, 1, 1, 2}
entriesByVisitor := make([]int, 5)
bestVisitor := 0

for _, visitor := range visitors {
    entriesByVisitor[visitor] += 1
    if entriesByVisitor[visitor] > entriesByVisitor[bestVisitor] {
        bestVisitor = visitor
    }
}

fmt.Println(bestVisitor)
