import Foundation

enum Color {
    case white
    case gray
    case black
}

var order: [Int] = []
var color: [Color] = Array(repeating: .white, count: n)  // Замените n на нужное значение

func topSort(_ v: Int, adjList: [[Int]]) {
    color[v] = .gray
    for w in adjList[v] {
        if color[w] == .white {
            topSort(w, adjList: adjList)
        }
    }
    color[v] = .black
    order.append(v)
}

func mainTopSort(n: Int, adjList: [[Int]]) {
    for i in 0..<n {
        if color[i] == .white {
            topSort(i, adjList: adjList)
        }
    }
}
