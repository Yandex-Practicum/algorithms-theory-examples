val fruits = listOf("яблоко", "яблоко", "груша", "яблоко", "слива")
val fruitCount = mutableMapOf<String, Int>()  // создаём пустой ассоциативный массив
for (fruit in fruits) {
    if (!fruitCount.containsKey(fruit)) {     // если в отображении нет такого ключа
        fruitCount[fruit] = 0                 // заводим счетчик с таким ключом
    }
    fruitCount[fruit] = fruitCount[fruit]!! + 1 // увеличиваем счетчик
}
