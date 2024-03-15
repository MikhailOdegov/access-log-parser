import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int correctFilePaths = 0;

        while (true) {
            System.out.println("Укажите путь до файла:");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                System.out.println("Файл не существует или указанный путь является путём к папке. Попробуйте ещё раз.");
                continue;
            }

            correctFilePaths++;
            System.out.println("Путь указан верно. Это файл номер " + correctFilePaths);
        }

    }


}
