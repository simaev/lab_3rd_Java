import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> textLines = new ArrayList<>();

        System.out.println("Введи текст (завершение - Enter):");

        try {
            while (true) {
                String line = reader.readLine();

                if (line.isEmpty()) {
                    break;
                }

                String onlyLettersAndSpaces = line.replaceAll("[^a-zA-Zа-яА-ЯёЁ ]", " ");

                String singleSpacesOnly = onlyLettersAndSpaces.replaceAll(" +", " ");

                String finalLine = singleSpacesOnly.trim();

                textLines.add(finalLine);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения с клавиатуры");
        }

        System.out.println("\nРезультат:");
        for (String processedLine : textLines) {
            System.out.println(processedLine);
        }
    }
}