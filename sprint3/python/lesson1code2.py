def find_file(folder, file_to_find):
    for path in folder:
        if os.path.isdir(path):
            # рекурсивно запустить поиск в подпапке
            file = find_file(path, file_to_find)
            if file is not None:  
                # если файл нашёлся, передать его вверх по цепочке рекурсивных вызовов
                return file
        else:  # path — обычный файл
            if get_filename(path) == file_to_find:
                # если нашли нужный файл, то вернуть результат
                return path
    return None
