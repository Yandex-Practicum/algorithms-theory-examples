class Queue<T> {
    private var queue: [T?]
    private var maxN: Int
    private var head: Int
    private var tail: Int
    private var size: Int
    
    init(n: Int) {
        queue = [T?](repeating: nil, count: n)
        maxN = n
        head = 0
        tail = 0
        size = 0
    }
    
    func isEmpty() -> Bool {
        return size == 0
    }
    
    func push(_ x: T) {
        if size != maxN {
            queue[tail] = x
            tail = (tail + 1) % maxN
            size += 1
        }
    }
    
    func pop() -> T? {
        if isEmpty() {
            return nil
        }
        let x = queue[head]
        queue[head] = nil
        head = (head + 1) % maxN
        size -= 1
        return x
    }
    
    func getQueue() -> [T?] {
        return queue
    }
    
    func getSize() -> Int {
        return size
    }
}

var q = Queue<Int>(n: 8)
q.push(42)
q.push(-1)
q.push(0)
q.push(11)
q.pop()

print(q.getQueue()) // [nil, Optional(-1), Optional(0), Optional(11), nil, nil, nil, nil]
print(q.getSize())  // 3

q.pop()
q.pop()
q.push(-8)
q.push(7)
q.push(3)
q.push(16)
print(q.getQueue()) // [nil, nil, nil, Optional(11), Optional(-8), Optional(7), Optional(3), Optional(16)]
print(q.getSize())  // 5
q.push(12)
print(q.getQueue()) // [Optional(12), nil, nil, Optional(11), Optional(-8), Optional(7), Optional(3), Optional(16)]
print(q.getSize())  // 6
