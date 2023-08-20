class Pair {
    let key: String
    var value: Any
    
    init(key: String, value: Any) {
        self.key = key
        self.value = value
    }
}

class Map {
    private var pairs: [Pair] = []
    
    func get(key: String) -> Any? {
        for pair in pairs {
            if pair.key == key {
                return pair.value
            }
        }
        return nil
    }
    
    func set(key: String, value: Any) {
        for pair in pairs {
            if pair.key == key {
                pair.value = value
                return
            }
        }
        let newPair = Pair(key: key, value: value)
        pairs.append(newPair)
    }
}