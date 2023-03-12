class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

class Map:
    def __init__(self):
        self.pairs = []

    def get(self, key):
        for pair in self.pairs:
            if pair.key == key:
                return pair.value
        return None

    def set(self, key, value):
        for pair in self.pairs:
            if pair.key == key:
                pair.value = value
                return
        new_pair = Pair(key, value)
        self.pairs.append(new_pair)
