const N = s.length;
const π = new Array(N).fill(0);

for (let i = 1; i < N; i++) {
  const substring = s.slice(0, i);
  for (let k = i - 1; k >= 0; k--) {
    const prefix = substring.slice(0, k);
    const suffix = substring.slice(i - k, i);
    if (prefix === suffix) {
      π[i - 1] = k;
      break;
    }
  }
}
