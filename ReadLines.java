import java.io.*;

public class ReadLines {
  public static void main(String[] args) throws IOException {
    String s = "ab";

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter lines of text. Type 'stop' to quit");

    while (!s.equals("stop")) {
      s = br.readLine();

      System.out.println(s);
    }
  }
}