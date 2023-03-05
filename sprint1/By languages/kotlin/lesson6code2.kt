Copy code
var cumulativeSums = mutableListOf(0)
var cgCount = 0
for (position in 0 until sequence.length) {
    if (sequence[position] == 'C' || sequence[position] == 'G') {
        cgCount++
    }
    cumulativeSums.add(cgCount)
}

println(cumulativeSums[right] - cumulativeSums[left])
