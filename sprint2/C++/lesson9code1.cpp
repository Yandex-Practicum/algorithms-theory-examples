#include <iostream>
#include <vector>

using namespace std;

class Queue {
    vector<int> queue;
    int max_n;
    int head;
    int tail;
    int size;

public:
    Queue(int n) {
        queue.resize(n);
        max_n = n;
        head = 0;
        tail = 0;
        size = 0;
    }

    bool is_empty() {
        return size == 0;
    }

    void push(int x) {
        if (size != max_n) {
            queue[tail] = x;
            tail = (tail + 1) % max_n;
            size += 1;
        }
    }

    int pop() {
        if (is_empty()) {
            return NULL;
        }
        int x = queue[head];
        queue[head] = NULL;
        head = (head + 1) % max_n;
        size -= 1;
        return x;
    }
};

int main() {
    Queue q(8);
    q.pop();
      # [None, -1, 0, 11, None, None, None, None]
    q.pop();
    q.pop();
    q.push(-8);
    q.push(7);
    q.push(3);
    q.push(16);
    # [None, None, None, 11, -8, 7, 3, 16]
    q.push(5);
    q.push(12);
    # [12, None, None, 11, -8, 7, 3, 16]
    return 0;
}