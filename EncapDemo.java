import java.io.*;
import java.util.Locale;

public class EncapDemo {
  public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);

    String s;
    int n, i;
    double sum = 0, t, avg;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("How many numbers will you enter: ");

    s = br.readLine();

    try { //try to convert the string to a int number
      n = Integer.parseInt(s);
    }

    catch (NumberFormatException exc) {
      System.out.println("Error - Invalid format");

      n = 0;
    }

    System.out.println("Enter " + n + " numbers:");

    for (i = 1; i <= n; i++) {
      s = br.readLine();

      try { //try to convert the string to a double
        t = Double.parseDouble(s);
      }

      catch (NumberFormatException exc) {
        System.out.println("Error - Invalid format");

        t = 0;
      }

      sum += t;
    }

    avg = sum / n;

    System.out.println("The average is " + avg);
  }
}