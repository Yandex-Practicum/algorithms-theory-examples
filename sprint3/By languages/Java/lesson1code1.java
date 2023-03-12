import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static String find_file(String folder, String file_to_find) {
        Queue<String> queue = new LinkedList<>();
        queue.add(folder);
        while (!queue.isEmpty()) {
            String item = queue.remove();
            File file = new File(item);
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    queue.add(f.getAbsolutePath());
                }
            } else {
                if (file.getName().equals(file_to_find)) {
                    return file.getAbsolutePath();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String folder = "/path/to/folder";
        String file_to_find = "file.txt";
        String result = find_file(folder, file_to_find);
        if (result == null) {
            System.out.println("File not found");
        } else {
            System.out.printf("File found at %s\n", result);
        }
    }
}
