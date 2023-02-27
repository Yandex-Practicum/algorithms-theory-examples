type Pair struct {
    key string
    value interface{}
}

type Map struct {
    pairs []*Pair
}

func (m *Map) Get(key string) interface{} {
    for _, pair := range m.pairs {
        if pair.key == key {
            return pair.value
        }
    }
    return nil
}

func (m *Map) Set(key string, value interface{}) {
    for _, pair := range m.pairs {
        if pair.key == key {
            pair.value = value
            return
        }
    }
    m.pairs = append(m.pairs, &Pair{key: key, value: value})
}
