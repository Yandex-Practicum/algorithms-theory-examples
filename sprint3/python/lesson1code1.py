import queue

def find_file(folder, file_to_find):
    q = queue.Queue()
    q.put(folder)
    while not q.empty():
        path = q.get()
        if os.path.isdir(path):
            for item in os.listdir(path):
                q.put(os.path.join(path, item))
        else:
            if os.path.basename(path) == file_to_find:
                return path
    return None