# Функция bucket вычисляет номер корзины для указанного фрукта.
# match-case появился в версии Python 3.10, проверьте, что он поддерживается в вашей среде.
def bucketV1(fruit):
    match fruit:
        case "яблоко":
            return 0
        case "слива":
            return 1
        case "груша":
            return 2
        case _:
            raise "Unknown fruit"


# Функция bucket вычисляет номер корзины для указанного фрукта.
# Реализация для более старых версий Python
def bucketV2(fruit):
    if fruit == "яблоко":
        return 0
    if fruit == "слива":
        return 1
    if fruit == "груша":
        return 2
    raise "Unknown fruit"
