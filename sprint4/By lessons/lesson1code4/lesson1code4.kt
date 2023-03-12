class Map {
    var pairs = arrayListOf<Pair>()

    fun get(key: Any): Any? {
        for (pair in pairs) {
            if (pair.key == key) {
                return pair.value
            }
        }
        return null
    }

    fun set(key: Any, value: Any) {
        for (pair in pairs) {
            if (pair.key == key) {
                pair.value = value
                return
            }
        }
        pairs.add(Pair(key, value))
    }
}

data class Pair(var key: Any, var value: Any)
