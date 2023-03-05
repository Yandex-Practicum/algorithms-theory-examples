cg_count = 0
for position in range(left, right):
    if (sequence[position] == 'C') or (sequence[position] == 'G'):
        cg_count += 1

print(cg_count)
