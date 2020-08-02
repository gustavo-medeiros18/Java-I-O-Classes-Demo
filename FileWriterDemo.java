import java.io.*;

public class FileWriterDemo {
  public static void main(String[] args) {
    String s = "ab";

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter some text. Type 'stop' to quit:");

    try (FileWriter fw = new FileWriter("output.txt", true)) {
      while (!s.equals("stop")) {
        s = br.readLine();

        if (s.equals("stop"))
          break;

        s += "\r\n"; //adds a new line to the string

        fw.write(s);
      }
    }

    catch (IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}