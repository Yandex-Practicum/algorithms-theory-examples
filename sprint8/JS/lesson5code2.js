function prefix_function(s) {
  const N = s.length;
  const π = new Array(N);
  π[0] = 0;

  for (let i = 1; i < N; i++) {
    let k = π[i - 1];
    while (k > 0 && s.charAt(k) !== s.charAt(i)) {
      k = π[k - 1];
    }
    if (s.charAt(k) === s.charAt(i)) {
      k++;
    }
    π[i] = k;
  }
  return π;
}
