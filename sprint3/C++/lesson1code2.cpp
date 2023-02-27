#include <iostream>
#include <string>
#include <vector>
#include <filesystem>

using namespace std;
namespace fs = std::filesystem;

string find_file(const string& folder, const string& file_to_find) {
    vector<string> files, dirs;
    for (const auto& entry : fs::directory_iterator(folder)) {
        if (fs::is_directory(entry.path())) {
            // рекурсивно запустить поиск в подпапке
            dirs.push_back(entry.path().string());
        } else {
            // entry.path() — обычный файл
            if (fs::path(entry.path()).filename().string() == file_to_find) {
                // если нашли нужный файл, то вернуть результат
                return entry.path().string();
            }
        }
    }
    for (const auto& dir : dirs) {
        string file = find_file(dir, file_to_find);
        if (!file.empty()) {
            // если файл нашёлся, передать его вверх по цепочке рекурсивных вызовов
            return file;
        }
    }
    return "";
}

int main() {
    string folder = "/path/to/folder";
    string file_to_find = "file.txt";
    string result = find_file(folder, file_to_find);
    if (result.empty()) {
        cout << "File not found" << endl;
    } else {
        cout << "File found at " << result << endl;
    }
    return 0;
}
