package main

import (
    "fmt"
)

type Queue struct {
    queue  []interface{}
    maxN   int
    head   int
    tail   int
    size   int
}

func NewQueue(n int) *Queue {
    return &Queue{
        queue:  make([]interface{}, n),
        maxN:   n,
        head:   0,
        tail:   0,
        size:   0,
    }
}

func (q *Queue) IsEmpty() bool {
    return q.size == 0
}

func (q *Queue) Push(x interface{}) {
    if q.size != q.maxN {
        q.queue[q.tail] = x
        q.tail = (q.tail + 1) % q.maxN
        q.size += 1
    }
}

func (q *Queue) Pop() interface{} {
    if q.IsEmpty() {
        return nil
    }
    x := q.queue[q.head]
    q.queue[q.head] = nil
    q.head = (q.head + 1) % q.maxN
    q.size -= 1
    return x
}

func main() {
    q := NewQueue(8)

    q.Pop()
    fmt.Println(q.queue) // [nil -1 0 11 nil nil nil nil]
    fmt.Println(q.size)  // 3

    q.Pop()
    q.Pop()
    q.Push(-8)
    q.Push(7)
    q.Push(3)
    q.Push(16)
    fmt.Println(q.queue) // [nil nil nil 11 -8 7 3 16]
    fmt.Println(q.size)  // 5

    q.Push(12)
    fmt.Println(q.queue) // [12 nil nil 11 -8 7 3 16]
    fmt.Println(q.size)  // 6
}
