class Queue {
  constructor(n) {
    this.queue = new Array(n).fill(null);
    this.max_n = n;
    this.head = 0;
    this.tail = 0;
    this.size = 0;
  }

  is_empty() {
    return this.size == 0;
  }

  push(x) {
    if (this.size != this.max_n) {
      this.queue[this.tail] = x;
      this.tail = (this.tail + 1) % this.max_n;
      this.size += 1;
    }
  }

  pop() {
    if (this.is_empty()) {
      return null;
    }
    let x = this.queue[this.head];
    this.queue[this.head] = null;
    this.head = (this.head + 1) % this.max_n;
    this.size -= 1;
    return x;
  }
}

let q = new Queue(8);
q.pop();
console.log(q.queue);  // [null, -1, 0, 11, null, null, null, null]
console.log(q.size);   // 3

q.pop();
q.pop();
q.push(-8);
q.push(7);
q.push(3);
q.push(16);
console.log(q.queue); // [null, null, null, 11, -8, 7, 3, 16]
console.log(q.size); // 5
q.push(12);
console.log(q.queue); // [12, null, null, 11, -8, 7, 3, 16]
console.log(q.size); // 6
