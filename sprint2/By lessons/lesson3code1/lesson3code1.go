package main

import "fmt"

func main() {
    films_wish_list := []string{"Джон Уик 3", "Аватар 2", "Форсаж 9", "Индиана Джонс 5", "Бэтмен"}
    films_wish_list = append(films_wish_list, "Чёрная Вдова")

    list_of_tasks := []string{"Полить цветы", "Приготовить завтрак", "Пойти на работу", "Сходить в магазин", "Позвонить бабушке"}

    fmt.Println(films_wish_list)
    fmt.Println(list_of_tasks)
}