using System;
using System.Collections.Generic;

public struct Pair {
    public string key;
    public string value;
}

public class Map {
    private List<Pair> pairs = new List<Pair>();

    public string get(string key) {
        foreach (var pair in pairs) {
            if (pair.key == key) { // пара с указанным ключом найдена
                return pair.value;
            }
        }
        return ""; // пара с указанным ключом не найдена
    }

    public void set(string key, string value) {
        foreach (var pair in pairs) {
            if (pair.key == key) { // пара с указанным ключом найдена
                // обновить значение в найденной паре
                pair.value = value;
                return;
            }
        }
        // пара с заданным ключом не найдена
        pairs.Add(new Pair{key = key, value = value});
    }
}
