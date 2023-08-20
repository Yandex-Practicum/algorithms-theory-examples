var cumulativeSums = [0]
var cgCount = 0
let sequence = "ACGTACGGTCGA"
let left = 0
let right = sequence.count

for position in 0..<sequence.count {
    let nucleotide = sequence[sequence.index(sequence.startIndex, offsetBy: position)]
    if nucleotide == "C" || nucleotide == "G" {
        cgCount += 1
    }
    cumulativeSums.append(cgCount)
}

print(cumulativeSums[right] - cumulativeSums[left])