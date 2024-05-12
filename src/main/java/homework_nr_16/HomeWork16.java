package homework_nr_16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HomeWork16 {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "src/main/java/homework_nr_16/files/input.txt";
        Path outputFilePath = Path.of("src/main/java/homework_nr_16/files/output.txt");

        File inputFile = new File(inputFilePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));

        List<Person> personsList = new ArrayList<>();

        String readString = null;
//        char symbol = ' ';
//        String word = "";
//        String sum = "";
//        int wordsCounter = 0;
//        String name = "";
//        int age = 0;
//       double rating = 0;
        String test = "";
            char symbol = ' ';
            String word = "";
            String sum = "";
            int wordsCounter = 0;
            String name = "";
            int age = 0;
            double rating = 0;

        while ((readString = bufferedReader.readLine()) != null) {
            System.out.println(test + "\n" + readString);
            System.out.println(readString.length());
            String[] words = readString.split(","); // разделяем строку
            for (String currentWord : words) {
                word = currentWord.trim(); // убираем лишние пробелы вокруг слова
                System.out.println(word);

            for (int index = 0; index != readString.length(); index++) {
                symbol = readString.charAt(index); //запишем текущий символ в переменную
                System.out.println(symbol);

                if (symbol == ',' || index < readString.length() -1) {
                    switch (wordsCounter) {
                        case 0:
                            name = word;
                            break;
                        case 1:
                            age = Integer.parseInt(word);
                            break;
                        case 2:
//                            System.out.println(word);
                            rating = Double.parseDouble(word);
                            break;
                    }
//                    sum = sum + word + " ";
//                    wordsCounter++;
                    word = "";
                } else {
                    word += symbol;
                }
            }
                wordsCounter = 0;
                personsList.add(new Person(name, age, rating));
        }
        bufferedReader.close();
        System.out.println(personsList);

        double avgRaiting = 0;

        System.out.println(avgRaiting);
        System.out.println(personsList.size());
    }
}
}