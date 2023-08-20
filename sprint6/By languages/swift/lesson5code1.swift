import Foundation

enum Color {
    case white
    case gray
    case black
}

// Замените V на нужное значение
var color: [Color] = Array(repeating: .white, count: V) 
var time: Int = 0
var entry: [Int] = Array(repeating: 0, count: V)  
var leave: [Int] = Array(repeating: 0, count: V)  

func DFS(_ v: Int, getOutgoingEdges: (Int) -> [Int]) {
    time += 1
    entry[v] = time
    color[v] = .gray
    
    for w in getOutgoingEdges(v) {
        if color[w] == .white {
            DFS(w, getOutgoingEdges: getOutgoingEdges)
        }
    }
    
    time += 1
    leave[v] = time
    color[v] = .black
}
