class Stack<T> {
    private var items = [T]()
    
    func push(_ item: T) {
        items.append(item)
    }
    
    func pop() -> T? {
        return items.popLast()
    }
    
    func peek() -> T? {
        return items.last
    }
    
    func size() -> Int {
        return items.count
    }
}

var stack = Stack<String>()
stack.push("apple")
stack.push("banana")
stack.push("orange")
stack.pop()