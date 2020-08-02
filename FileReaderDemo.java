import java.io.*;

public class FileReaderDemo {
  public static void main(String[] args) throws IOException {
    String s;

    try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
      while ((s = br.readLine()) != null) {
        System.out.println(s);
      }
    }

    catch (FileNotFoundException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}