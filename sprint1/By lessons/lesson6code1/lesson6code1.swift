var cgCount = 0
let sequence = "ACGTACGGTCGA"
let left = 0
let right = sequence.count

for position in left..<right {
    let nucleotide = sequence[sequence.index(sequence.startIndex, offsetBy: position)]
    if nucleotide == "C" || nucleotide == "G" {
        cgCount += 1
    }
}

print(cgCount)