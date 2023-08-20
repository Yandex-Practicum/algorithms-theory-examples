import Foundation

enum Color {
    case white, gray, black
}

let V = 100  // число вершин графа

var adjList = Array(repeating: [Int](), count: V)
var color = Array(repeating: Color.white, count: V)
var previous = Array(repeating: -1, count: V)
var distance = Array(repeating: 0, count: V)

func BFS(_ s: Int) {
    var planned = Queue<Int>()
    planned.enqueue(s)
    color[s] = .gray
    distance[s] = 0
    while !planned.isEmpty {
        let u = planned.dequeue()!
        for v in adjList[u] {
            if color[v] == .white {
                distance[v] = distance[u] + 1
                previous[v] = u
                color[v] = .gray
                planned.enqueue(v)
            }
        }
        color[u] = .black
    }
}

func ShortestPath(_ v: Int) -> Stack<Int> {
    var path = Stack<Int>()
    var currentVertex = v
    while currentVertex != -1 {
        path.push(currentVertex)
        currentVertex = previous[currentVertex]
    }
    return path
}

// add edges to adjList

BFS(0)
let path = ShortestPath(4)
while !path.isEmpty {
    print(path.pop()!, terminator: " ")
}
print()
