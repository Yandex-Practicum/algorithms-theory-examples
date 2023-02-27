// Словарь "статистика посещения страниц"
Map<String, Map<String, Integer>> pagesVisitStats = Map.of(
    "https://timofey.me", Map.of(
        "main", 2,
        "contacts", 3
    ),
    "https://fruit-shop.ru", Map.of(
        "apples", 12,
        "plums", 10,
        "pears", 20,
        "contacts", 15
    )
);

Map<String, Integer> siteStats = pagesVisitStats.get("https://timofey.me");
