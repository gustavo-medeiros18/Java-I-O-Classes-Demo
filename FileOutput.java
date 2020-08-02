import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class FileOutput {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    try (PrintWriter pw = new PrintWriter("teste.txt")){
      Scanner in = new Scanner(System.in);

      float x = in.nextFloat();

      in.close();

      pw.println(x);
    }

    catch (IOException exc) {
      System.out.println("I/O Exception: " + exc);
    }
  }
}