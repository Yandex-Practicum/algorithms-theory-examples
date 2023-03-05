const cumulative_sums = [0];
let cg_count = 0;
for (let position = 0; position < sequence.length; position++) {
    if (sequence[position] === 'C' || sequence[position] === 'G') {
        cg_count++;
    }
    cumulative_sums.push(cg_count);
}
console.log(cumulative_sums[right] - cumulative_sums[left]);
