#include <iostream>
#include <vector>
#include <string>

class Stack {
private:
    std::vector<std::string> items;

public:
    void push(std::string item) {
        items.push_back(item);
    }

    std::string pop() {
        std::string lastItem = items.back();
        items.pop_back();
        return lastItem;
    }

    std::string peek() {
        return items.back();
    }

    int size() {
        return items.size();
    }
};

int main() {
    Stack stack;
    stack.push("apple");
    stack.push("banana");
    stack.push("orange");
    stack.pop();

    return 0;
}
