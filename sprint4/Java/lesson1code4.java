import java.util.ArrayList;

class Pair<K, V> {
  public K key;
  public V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }
}

class Map<K, V> {
  private ArrayList<Pair<K, V>> pairs = new ArrayList<Pair<K, V>>();

  public V get(K key) {
    for (Pair<K, V> pair : pairs) {
      if (pair.key.equals(key)) { // пара с указанным ключом найдена
        return pair.value;
      }
    }
    return null;
  }

  public void set(K key, V value) {
    for (Pair<K, V> pair : pairs) {
      if (pair.key.equals(key)) { // пара с указанным ключом найдена
        // обновить значение в найденной паре
        pair.value = value;
        return;
      }
    }
    // пара с заданным ключом не найдена
    // добавить пару (key, value) в pairs
    pairs.add(new Pair<K, V>(key, value));
  }
}
