func funcCall(step: Int) {
    print("Call me. Step:", step)
}

funcCall(step: 1)
funcCall(step: 2)
funcCall(step: 3)

func sayHello(name: String) {
    print("Привет, \(name)")
    printHoroscope(name: name.uppercased())
    print("Пока, \(name), хорошего дня!")
}

func printHoroscope(name: String) {
    print("\(name)! Сегодня подходящий день для прогулок в парке и изучения рекурсии")
}

sayHello(name: "Гоша")
