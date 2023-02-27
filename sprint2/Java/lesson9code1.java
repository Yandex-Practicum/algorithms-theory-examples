class Queue {
    private Integer[] queue;
    private int max_n;
    private int head;
    private int tail;
    private int size;

    public Queue(int n) {
        queue = new Integer[n];
        max_n = n;
        head = 0;
        tail = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int x) {
        if (size != max_n) {
            queue[tail] = x;
            tail = (tail + 1) % max_n;
            size++;
        }
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        }
        Integer x = queue[head];
        queue[head] = null;
        head = (head + 1) % max_n;
        size--;
        return x;
    }
}

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(8);

        q.pop();
        System.out.println(Arrays.toString(q.queue)); // [null, -1, 0, 11, null, null, null, null]
        System.out.println(q.size); // 3

        q.pop();
        q.pop();
        q.push(-8);
        q.push(7);
        q.push(3);
        q.push(16);
        System.out.println(Arrays.toString(q.queue)); // [null, null, null, 11, -8, 7, 3, 16]
        System.out.println(q.size); // 5

        q.push(12);
        System.out.println(Arrays.toString(q.queue)); // [12, null, null, 11, -8, 7, 3, 16]
        System.out.println(q.size); // 6
    }
}
