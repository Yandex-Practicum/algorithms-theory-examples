fun findFile(folder: String, fileToFind: String): String? {
    val queue = java.util.LinkedList<String>()
    queue.addAll(File(folder).listFiles().map { it.absolutePath })

    while (queue.isNotEmpty()) {
        val path = queue.poll()
        if (File(path).isDirectory) {
            queue.addAll(File(path).listFiles().map { it.absolutePath })
        } else {
            if (File(path).name == fileToFind) {
                return path
            }
        }
    }
    return null
}