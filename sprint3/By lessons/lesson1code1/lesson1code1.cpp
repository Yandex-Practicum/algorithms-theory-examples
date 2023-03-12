#include <iostream>
#include <queue>
#include <filesystem>

namespace fs = std::filesystem;

std::string find_file(const std::string& folder, const std::string& file_to_find) {
    std::queue<std::string> q;
    q.push(folder);
    while (!q.empty()) {
        std::string path = q.front();
        q.pop();
        if (fs::is_directory(path)) {
            for (const auto& item : fs::directory_iterator(path)) {
                q.push(item.path().string());
            }
        } else {
            if (fs::path(path).filename() == file_to_find) {
                return path;
            }
        }
    }
    return "";
}

int main() {
    std::string folder = "/path/to/folder";
    std::string file_to_find = "file.txt";
    std::string result = find_file(folder, file_to_find);
    if (result.empty()) {
        std::cout << "File not found\n";
    } else {
        std::cout << "File found at " << result << "\n";
    }
    return 0;
}
