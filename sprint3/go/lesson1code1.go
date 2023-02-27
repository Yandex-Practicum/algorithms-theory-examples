package main

import (
    "fmt"
    "os"
    "path/filepath"
)

func find_file(folder string, file_to_find string) string {
    queue := []string{folder}
    for len(queue) > 0 {
        item := queue[0]
        queue = queue[1:]
        info, err := os.Stat(item)
        if err != nil {
            continue
        }
        if info.IsDir() {
            files, err := os.ReadDir(item)
            if err != nil {
                continue
            }
            for _, file := range files {
                queue = append(queue, filepath.Join(item, file.Name()))
            }
        } else {
            if filepath.Base(item) == file_to_find {
                return item
            }
        }
    }
    return ""
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
