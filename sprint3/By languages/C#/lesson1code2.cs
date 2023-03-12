using System;
using System.Collections.Generic;
using System.IO;

class MainClass {
    public static string find_file(string folder, string file_to_find) {
        string[] files = Directory.GetFiles(folder);
        string[] dirs = Directory.GetDirectories(folder);
        foreach (string path in files) {
            if (Path.GetFileName(path) == file_to_find) {
                // если нашли нужный файл, то вернуть результат
                return path;
            }
        }
        foreach (string path in dirs) {
            // рекурсивно запустить поиск в подпапке
            string file = find_file(path, file_to_find);
            if (file != null) {
                // если файл нашёлся, передать его вверх по цепочке рекурсивных вызовов
                return file;
            }
        }
        return null;
    }

    public static string get_filename(string path) {
        return Path.GetFileName(path);
    }

    public static void Main() {
        string folder = "/path/to/folder";
        string file_to_find = "file.txt";
        string result = find_file(folder, file_to_find);
        if (result == null) {
            Console.WriteLine("File not found");
        } else {
            Console.WriteLine("File found at {0}", result);
        }
    }
}
