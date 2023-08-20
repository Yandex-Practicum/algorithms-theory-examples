import Foundation

func findFile(folder: String, fileToFind: String) -> String? {
    let fileManager = FileManager.default
    if let contents = try? fileManager.contentsOfDirectory(atPath: folder) {
        for path in contents {
            let fullPath = "\(folder)/\(path)"
            var isDir: ObjCBool = false
            if fileManager.fileExists(atPath: fullPath, isDirectory: &isDir) {
                if isDir.boolValue {
                    if let file = findFile(folder: fullPath, fileToFind: fileToFind) {
                        return file
                    }
                } else {
                    if getFilename(from: path) == fileToFind {
                        return fullPath
                    }
                }
            }
        }
    }
    return nil
}

func getFilename(from path: String) -> String {
    return URL(fileURLWithPath: path).lastPathComponent
}

