// Словарь "статистика посещения страниц"
pagesVisitStats := map[string]map[string]int{
    "https://timofey.me": map[string]int{
        "main":     2,
        "contacts": 3,
    },
    "https://fruit-shop.ru": map[string]int{
        "apples":   12,
        "plums":    10,
        "pears":    20,
        "contacts": 15,
    },
}

siteStats := pagesVisitStats["https://timofey.me"]
