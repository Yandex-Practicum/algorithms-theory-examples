function get_least_primes_linear(n) {
  let lp = new Array(n + 1).fill(0);
  let primes = [];

  for (let i = 2; i <= n; i++) {
    if (lp[i] == 0) {
      lp[i] = i;
      primes.push(i);
    }

    for (let j = 0; j < primes.length; j++) {
      let x = primes[j] * i;
      if (primes[j] > lp[i] || x > n) {
        break;
      }
      lp[x] = primes[j];
    }
  }

  return [primes, lp];
}
