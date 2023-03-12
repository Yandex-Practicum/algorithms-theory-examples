using System;
using System.Collections.Generic;

class Stack {
    private List<string> items;

    public Stack() {
        items = new List<string>();
    }

    public void Push(string item) {
        items.Add(item);
    }

    public string Pop() {
        string lastItem = items[items.Count - 1];
        items.RemoveAt(items.Count - 1);
        return lastItem;
    }

    public string Peek() {
        return items[items.Count - 1];
    }

    public int Size() {
        return items.Count;
    }
}

class Program {
    static void Main(string[] args) {
        Stack stack = new Stack();
        stack.Push("apple");
        stack.Push("banana");
        stack.Push("orange");
        stack.Pop();
    }
}
