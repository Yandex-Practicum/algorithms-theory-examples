function factorial(n) {
  let accumulator = 1;
  let i = n;
  while (i > 1) {
    accumulator *= i;
    i -= 1;
  }
  return accumulator;
}
