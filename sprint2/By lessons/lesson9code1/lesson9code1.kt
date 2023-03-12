class Queue(private val n: Int) {
    private val queue = arrayOfNulls<Int>(n)
    private val maxN = n
    private var head = 0
    private var tail = 0
    private var size = 0

    fun isEmpty() = size == 0

    fun push(x: Int) {
        if (size != maxN) {
            queue[tail] = x
            tail = (tail + 1) % maxN
            size += 1
        }
    }

    fun pop(): Int? {
        if (isEmpty()) {
            return null
        }
        val x = queue[head]
        queue[head] = null
        head = (head + 1) % maxN
        size -= 1
        return x
    }
}

val q = Queue(8)
q.push(-1)
q.push(0)
q.push(11)

println(q.pop())   // -1
println(q.queue.toList())  // [None, -1, 0, 11, None, None, None, None]
println(q.size)   // 3

q.pop()
q.pop()
q.push(-8)
q.push(7)
q.push(3)
q.push(16)
println(q.queue.toList()) // [None, None, None, 11, -8, 7, 3, 16]
println(q.size) // 5
q.push(12)
println(q.queue.toList()) // [12, None, None, 11, -8, 7, 3, 16]
println(q.size) // 6