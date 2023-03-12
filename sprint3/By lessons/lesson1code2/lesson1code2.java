import java.io.File;

public class Main {

    public static String findFile(File folder, String fileToFind) {
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                // рекурсивно запустить поиск в подпапке
                String filePath = findFile(file, fileToFind);
                if (filePath != null) {
                    // если файл нашёлся, передать его вверх по цепочке рекурсивных вызовов
                    return filePath;
                }
            } else { // file - обычный файл
                if (file.getName().equals(fileToFind)) {
                    // если нашли нужный файл, то вернуть результат
                    return file.getAbsolutePath();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        File folder = new File("/path/to/folder");
        String fileToFind = "file.txt";
        String result = findFile(folder, fileToFind);
        if (result == null) {
            System.out.println("File not found");
        } else {
            System.out.println("File found at " + result);
        }
    }
}
