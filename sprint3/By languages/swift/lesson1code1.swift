import Foundation

func findFile(folder: String, fileToFind: String) -> String? {
    let queue = DispatchQueue(label: "com.example.queue")
    var resultPath: String?

    let q = DispatchQueue(label: "com.example.queue")
    q.async {
        queue.sync {
            var q = Queue<String>()
            q.enqueue(folder)

            while let path = q.dequeue() {
                if FileManager.default.isDirectory(path: path) {
                    if let items = try? FileManager.default.contentsOfDirectory(atPath: path) {
                        for item in items {
                            q.enqueue("\(path)/\(item)")
                        }
                    }
                } else {
                    if path.lastPathComponent == fileToFind {
                        resultPath = path
                        return
                    }
                }
            }
        }
    }

    q.sync { }
    return resultPath
}

extension FileManager {
    func isDirectory(path: String) -> Bool {
        var isDirectory: ObjCBool = false
        return fileExists(atPath: path, isDirectory: &isDirectory) && isDirectory.boolValue
    }
}

