// Словарь "статистика посещения страниц"
val pagesVisitStats = mapOf(
    "https://timofey.me" to mapOf(
        "main" to 2,
        "contacts" to 3
    ),
    "https://fruit-shop.ru" to mapOf(
        "apples" to 12,
        "plums" to 10,
        "pears" to 20,
        "contacts" to 15
    )
)

val siteStats = pagesVisitStats["https://timofey.me"]
