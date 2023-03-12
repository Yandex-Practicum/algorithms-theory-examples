class Node {
  constructor(value = null, next = null) {
    this.value = value;
    this.next = next;
  }
}

function printLinkedList(vertex) {
  while (vertex) {
    process.stdout.write(`${vertex.value} -> `);
    vertex = vertex.next;
  }
  console.log('None');
}

const n3 = new Node('third');
const n2 = new Node('second', n3);
const n1 = new Node('first', n2);

printLinkedList(n1);
printLinkedList(n2);
