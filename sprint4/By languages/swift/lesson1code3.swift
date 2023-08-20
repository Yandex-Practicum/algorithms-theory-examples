var fruits = ["яблоко", "яблоко", "груша", "яблоко", "слива"]
var fruitCount: [String: Int] = [:]

for fruit in fruits {
    if fruitCount[fruit] == nil {
        fruitCount[fruit] = 0
    }
    fruitCount[fruit]! += 1
}
