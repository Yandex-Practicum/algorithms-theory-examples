# Функция bucket вычисляет номер корзины для указанного фрукта
def bucket(fruit):
    if fruit == "яблоко":
        return 0
    elif fruit == "слива":
        return 1
    elif fruit == "груша":
        return 2
    else:
        raise ValueError("Неизвестный фрукт")
