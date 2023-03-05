cumulativeSums := []int{0}
cgCount := 0
for position := 0; position < len(sequence); position++ {
    if sequence[position] == 'C' || sequence[position] == 'G' {
        cgCount++
    }
    cumulativeSums = append(cumulativeSums, cgCount)
}
fmt.Println(cumulativeSums[right] - cumulativeSums[left])
