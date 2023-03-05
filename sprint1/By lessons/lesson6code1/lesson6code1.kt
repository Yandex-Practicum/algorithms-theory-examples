var cgCount = 0
for (position in left until right) {
    if (sequence[position] == 'C' || sequence[position] == 'G') {
        cgCount++
    }
}

println(cgCount)