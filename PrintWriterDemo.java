import java.io.PrintWriter;

public class PrintWriterDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);

    int i = 10;
    double d = 9.5;

    pw.println("This is the output using the PrintWriter class: " + i + " " + d);
  }
}