package main

import "fmt"

type Node struct {
	value string
	next  *Node
}

func printLinkedList(vertex *Node) {
	for vertex != nil {
		fmt.Printf("%s -> ", vertex.value)
		vertex = vertex.next
	}
	fmt.Println("None")
}

func main() {
	n3 := &Node{value: "third"}
	n2 := &Node{value: "second", next: n3}
	n1 := &Node{value: "first", next: n2}
	printLinkedList(n1)
	printLinkedList(n2)
}