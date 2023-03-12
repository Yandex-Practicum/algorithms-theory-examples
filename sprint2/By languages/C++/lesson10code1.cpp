#include <iostream>
#include <string>

void func(int step) {
    std::cout << "Call me. Step: " << step << std::endl;
}

void print_horoscope(std::string name) {
    std::cout << name << "! Сегодня подходящий день для прогулок в парке и изучения рекурсии" << std::endl;
}

void say_hello(std::string name) {
    std::cout << "Привет, " << name << std::endl;
    print_horoscope(name);
    std::cout << "Пока, " << name << ", хорошего дня!" << std::endl;
}

int main() {
    func(1);
    func(2);
    func(3);

    say_hello("Гоша");

    return 0;
}
