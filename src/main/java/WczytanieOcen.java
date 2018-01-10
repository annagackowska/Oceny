import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.nio.file.Paths;


public class WczytanieOcen {
    public static void main(String[] args) throws IOException {
        File file = new File("Uczniowie.txt");

       List<String> lines = Files.readAllLines(Paths.get("Uczniowie.txt"));
       for (String line : lines)

       System.out.println(line);
       }
}
