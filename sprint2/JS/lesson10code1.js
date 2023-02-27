function func(step) {
  console.log('Call me. Step:', step);
}

func(1);
func(2);
func(3);

function say_hello(name) {
  console.log(`Привет, ${name}`);
  print_horoscope(name.toUpperCase());
  console.log(`Пока, ${name}, хорошего дня!`);
}

function print_horoscope(name) {
  console.log(`${name}! Сегодня подходящий день для прогулок в парке и изучения рекурсии`);
}

say_hello('Гоша');
