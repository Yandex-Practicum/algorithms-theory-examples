class Node {
    var key: Int
    var height: Int = 1
    var left: Node? = null
    var right: Node? = null

    constructor(key: Int, height: Int = 1, left: Node? = null, right: Node? = null) {
        this.key = key
        this.height = height
        this.left = left
        this.right = right
    }
}
