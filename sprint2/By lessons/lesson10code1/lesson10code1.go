package main

import "fmt"

func func1(step int) {
    fmt.Println("Call me. Step:", step)
}

func sayHello(name string) {
    fmt.Printf("Привет, %s\n", name)
    printHoroscope(name)
    fmt.Printf("Пока, %s, хорошего дня!\n", name)
}

func printHoroscope(name string) {
    fmt.Printf("%s! Сегодня подходящий день для прогулок в парке и изучения рекурсии\n", name)
}

func main() {
    func1(1)
    func1(2)
    func1(3)

    sayHello("Гоша")
}
