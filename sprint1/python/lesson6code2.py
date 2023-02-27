cumulative_sums = [0]
cg_count = 0
for position in range(0, len(sequence)):
    if (sequence[position] == 'C') or (sequence[position] == 'G'):
        cg_count += 1
    cumulative_sums.append(cg_count)

print(cumulative_sums[right] - cumulative_sums[left])
