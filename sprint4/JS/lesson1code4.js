class Map {
  constructor() {
    this.pairs = [];
  }

  get(key) {
    for (let pair of this.pairs) {
      if (pair.key === key) { // пара с указанным ключом найдена
        return pair.value;
      }
    }
    return null;
  }

  set(key, value) {
    for (let pair of this.pairs) {
      if (pair.key === key) { // пара с указанным ключом найдена
        // обновить значение в найденной паре
        pair.value = value;
        return;
      }
    }
    // пара с заданным ключом не найдена
    // добавить пару (key, value) в pairs
    this.pairs.push({key: key, value: value});
  }
}
