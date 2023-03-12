package main

import (
    "fmt"
    "io/ioutil"
    "os"
    "path/filepath"
)

func find_file(folder string, file_to_find string) string {
    files, err := ioutil.ReadDir(folder)
    if err != nil {
        return ""
    }
    for _, f := range files {
        path := filepath.Join(folder, f.Name())
        if f.IsDir() {
            // рекурсивно запустить поиск в подпапке
            file := find_file(path, file_to_find)
            if file != "" {
                // если файл нашёлся, передать его вверх по цепочке рекурсивных вызовов
                return file
            }
        } else {
            if get_filename(path) == file_to_find {
                // если нашли нужный файл, то вернуть результат
                return path
            }
        }
    }
    return ""
}

func get_filename(path string) string {
    return filepath.Base(path)
}

func main() {
    folder := "/path/to/folder"
    file_to_find := "file.txt"
    result := find_file(folder, file_to_find)
    if result == "" {
        fmt.Println("File not found")
    } else {
        fmt.Printf("File found at %s\n", result)
    }
}
