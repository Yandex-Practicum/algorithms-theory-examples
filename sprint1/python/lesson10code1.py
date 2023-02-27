def solve(array: List[int]) -> int:
    maximal_sum = 0 # Сумма пустого префикса равна 0
    for i in range(len(array)):
        current_sum = sum[array[0: i + 1])
	      if maximal_sum < current_sum:
            maximal_sum = current_sum
    return maximal_sum
