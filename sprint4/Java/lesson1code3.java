List<String> fruits = Arrays.asList("яблоко", "яблоко", "груша", "яблоко", "слива");
Map<String, Integer> fruitCount = new HashMap<>();
for (String fruit : fruits) {
    if (!fruitCount.containsKey(fruit)) {
        fruitCount.put(fruit, 0);
    }
    fruitCount.put(fruit, fruitCount.get(fruit) + 1);
}
