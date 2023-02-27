function stairs_builder(n) {
  // build 1 step
  console.log(`Осталось построить ${n} ступеней.`);
  stairs_builder(n - 1);
}

stairs_builder(5);
