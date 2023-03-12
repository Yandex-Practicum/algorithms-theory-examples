using System;

class Queue {
    private int[] queue;
    private int max_n;
    private int head;
    private int tail;
    private int size;

    public Queue(int n) {
        queue = new int[n];
        max_n = n;
        head = 0;
        tail = 0;
        size = 0;
    }

    public bool is_empty() {
        return size == 0;
    }

    public void push(int x) {
        if (size != max_n) {
            queue[tail] = x;
            tail = (tail + 1) % max_n;
            size += 1;
        }
    }

    public int pop() {
        if (is_empty()) {
            return 0;
        }
        int x = queue[head];
        queue[head] = 0;
        head = (head + 1) % max_n;
        size -= 1;
        return x;
    }
}

class Program {
    static void Main(string[] args) {
        Queue q = new Queue(8);
        q.pop();
        Console.WriteLine(string.Join(", ", q.queue)); // 0, 0, 0, 0, 0, 0, 0, 0
        Console.WriteLine(q.size); // 0

        q.pop();
        q.pop();
        q.push(-8);
        q.push(7);
        q.push(3);
        q.push(16);
        Console.WriteLine(string.Join(", ", q.queue)); // 11, -8, 7, 3, 16, 0, 0, 0
        Console.WriteLine(q.size); // 5

        q.push(12);
        Console.WriteLine(string.Join(", ", q.queue)); // 11, -8, 7, 3, 16, 12, 0, 0
        Console.WriteLine(q.size); // 6
    }
}
