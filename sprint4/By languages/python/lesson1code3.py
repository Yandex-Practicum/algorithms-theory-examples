fruits = ["яблоко", "яблоко", "груша", "яблоко", "слива"]
fruitCount = {}
for fruit in fruits:
    if fruit not in fruitCount:
        fruitCount[fruit] = 0
    fruitCount[fruit] += 1
