const fruits = ["яблоко", "яблоко", "груша", "яблоко", "слива"];
const fruitCount = new Map();
for (const fruit of fruits) {
    if (!fruitCount.has(fruit)) {
        fruitCount.set(fruit, 0);
    }
    fruitCount.set(fruit, fruitCount.get(fruit) + 1);
}
