package homework_nr_16;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HomeWork16 {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "src/main/java/homework_nr_16/files/input.txt";
        Path outputFile = Path.of("src/main/java/homework_nr_16/files/output.txt");

        File inputFile = new File(inputFilePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));

        List<Person> personsList = new ArrayList<>();
        String readString = null;

        while ((readString = bufferedReader.readLine()) != null) {
            String name = "";
            int age = 0;
            double rating = 0;
            String[] words = readString.split(","); // разделяем строку
            name = words[0].trim();
            age = Integer.parseInt(words[1].trim());
            rating = Double.parseDouble(words[2].trim());
            personsList.add(new Person(name, age, rating));
        }
        bufferedReader.close();

        double avgRating = personsList.stream()
                .mapToDouble(Person::getRating)
                .average()
                .orElse(0);

        Person youngestPerson = personsList.stream()
                .min(Comparator.comparingInt(e -> e.getAge()))
                .orElse(null);

        Person oldestPerson = personsList.stream()
                .max(Comparator.comparingInt(e -> e.getAge()))
                .orElse(null);

        if (Files.exists(outputFile)) {
            Files.writeString(outputFile, "Average rating is: " + avgRating + "\n", StandardOpenOption.APPEND);
            Files.writeString(outputFile, "The youngest person is: " + youngestPerson.getName() + "(Age: " + youngestPerson.getAge() + ")\n", StandardOpenOption.APPEND);
            Files.writeString(outputFile, "The oldest person is: " + oldestPerson.getName() + "(Age: " + oldestPerson.getAge() + ")\n", StandardOpenOption.APPEND);
        }
    }
}
