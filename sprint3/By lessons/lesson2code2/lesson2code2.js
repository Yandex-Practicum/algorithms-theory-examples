function stairs_builder(n) {
  if (n === 0) {
    return;
  }
  // build 1 step
  console.log(`Осталось построить ${n} ступеней.`);
  stairs_builder(n - 1);
}

stairs_builder(5);
