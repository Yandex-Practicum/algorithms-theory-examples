let cg_count = 0;
for (let position = left; position < right; position++) {
    if (sequence[position] === 'C' || sequence[position] === 'G') {
        cg_count++;
    }
}
console.log(cg_count);
