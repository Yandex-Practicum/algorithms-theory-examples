fun findFile(folder: List<String>, fileToFind: String): String? {
    for (path in folder) {
        if (File(path).isDirectory) {
            // рекурсивно запустить поиск в подпапке
            val file = findFile(File(path).list().toList(), fileToFind)
            if (file != null) {
                // если файл нашёлся, передать его вверх по цепочке рекурсивных вызовов
                return file
            }
        } else {  // path — обычный файл
            if (File(path).name == fileToFind) {
                // если нашли нужный файл, то вернуть результат
                return path
            }
        }
    }
    return null
}