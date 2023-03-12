using System;
using System.Collections.Generic;

class Program {
    static void Main(string[] args) {
        var pagesVisitStats = new Dictionary<string, Dictionary<string, int>> {
            {"https://timofey.me", new Dictionary<string, int> {{"main", 2}, {"contacts", 3}}},
            {"https://fruit-shop.ru", new Dictionary<string, int> {{"apples", 12}, {"plums", 10}, {"pears", 20}, {"contacts", 15}}}
        };

        var siteStats = pagesVisitStats["https://timofey.me"];
    }
}
