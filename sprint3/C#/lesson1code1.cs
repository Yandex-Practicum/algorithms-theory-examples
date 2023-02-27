using System;
using System.Collections.Generic;
using System.IO;

class MainClass {
    public static string find_file(string folder, string file_to_find) {
        Queue<string> queue = new Queue<string>();
        queue.Enqueue(folder);
        while (queue.Count > 0) {
            string item = queue.Dequeue();
            if (Directory.Exists(item)) {
                string[] files = Directory.GetFiles(item);
                string[] subdirs = Directory.GetDirectories(item);
                foreach (string file in files) {
                    queue.Enqueue(file);
                }
                foreach (string subdir in subdirs) {
                    queue.Enqueue(subdir);
                }
            } else {
                if (Path.GetFileName(item) == file_to_find) {
                    return item;
                }
            }
        }
        return null;
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
