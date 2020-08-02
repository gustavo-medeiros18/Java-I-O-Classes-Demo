import java.io.*;

public class ReadChars {
  public static void main(String[] args) throws IOException {
    char c = 'a';

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter some characters. Type period to quit");

    while (c != '.') {
      c = (char) br.read();

      System.out.println(c);
    }
  }
}