#include <vector>
#include <utility>

struct Pair {
    std::string key;
    std::string value;
};

class Map {
private:
    std::vector<Pair> pairs;
public:
    std::string get(std::string key) {
        for (auto pair : pairs) {
            if (pair.key == key) { // пара с указанным ключом найдена
                return pair.value;
            }
        }
        return ""; // пара с указанным ключом не найдена
    }

    void set(std::string key, std::string value) {
        for (auto& pair : pairs) {
            if (pair.key == key) { // пара с указанным ключом найдена
                // обновить значение в найденной паре
                pair.value = value;
                return;
            }
        }
        // пара с заданным ключом не найдена
        pairs.emplace_back(Pair{key, value});
    }
};
