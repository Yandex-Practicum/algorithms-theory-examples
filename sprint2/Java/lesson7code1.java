import java.util.*;

class Stack {
  private List<String> items;

  public Stack() {
    items = new ArrayList<String>();
  }

  public void push(String item) {
    items.add(item);
  }

  public String pop() {
    return items.remove(items.size() - 1);
  }

  public String peek() {
    return items.get(items.size() - 1);
  }

  public int size() {
    return items.size();
  }
}

Stack stack = new Stack();
stack.push("apple");
stack.push("banana");
stack.push("orange");
stack.pop();
