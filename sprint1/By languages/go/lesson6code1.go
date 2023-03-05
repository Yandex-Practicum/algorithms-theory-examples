cgCount := 0
for position := left; position < right; position++ {
    if sequence[position] == 'C' || sequence[position] == 'G' {
        cgCount++
    }
}
fmt.Println(cgCount)
