#include <iostream>
#include <map>
#include <string>

int main() {
    std::map<std::string, std::map<std::string, int>> pagesVisitStats {
        {"https://timofey.me", {{"main", 2}, {"contacts", 3}}},
        {"https://fruit-shop.ru", {{"apples", 12}, {"plums", 10}, {"pears", 20}, {"contacts", 15}}}
    };
    
    auto siteStats = pagesVisitStats["https://timofey.me"];
    return 0;
}
