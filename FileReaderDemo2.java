import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    String s = "";

    try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
      while (s != null) {
        s = br.readLine();

        if (s != null)
         System.out.println(s);
      }
    }
  }
}