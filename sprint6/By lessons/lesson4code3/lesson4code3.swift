func DFS(_ startVertex: Int, adjList: [[Int]], color: inout [Color]) {
    var st = [Int]()
    st.append(startVertex)
    
    while !st.isEmpty {
        let v = st.last!  // Получаем из стека очередную вершину.
        st.removeLast()
        
        if color[v] == .white {
            // Красим вершину в серый. И сразу кладём её обратно в стек:
            // это позволит алгоритму позднее вспомнить обратный путь по графу.
            color[v] = .gray
            st.append(v)
            
            // Теперь добавляем в стек все непосещённые соседние вершины,
            // вместо вызова рекурсии
            for w in adjList[v] {  // Перебираем смежные вершины.
                if color[w] == .white {  // Если вершина не посещена, то
                    st.append(w)
                }
            }
        } else if color[v] == .gray {
            // Серую вершину мы могли получить из стека только на обратном пути.
            // Следовательно, её следует перекрасить в чёрный.
            color[v] = .black
        }
    }
}
