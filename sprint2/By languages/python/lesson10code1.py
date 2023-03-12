def func(step):
    print('Call me. Step:', step)

func(1)
func(2)
func(3)

def say_hello(name):
    print(f"Привет, {name}")
    print_horoscope(name.upper())
    print(f"Пока, {name}, хорошего дня!")

def print_horoscope(name):
    print(f"{name}! Сегодня подходящий день для прогулок в парке и изучения рекурсии") 

say_hello('Гоша')