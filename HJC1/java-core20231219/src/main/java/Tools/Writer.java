package Tools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    public void writeNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите заметку: ");
        String note = scanner.nextLine();
        scanner.close();

        String timeStamp = Time.getCurrentTimeStamp();
        String content = timeStamp + " -> " + note + "\n";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("zametka.txt", true))) {
            bufferedWriter.write(content);
            System.out.println("Заметка добавлена: " + content);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}