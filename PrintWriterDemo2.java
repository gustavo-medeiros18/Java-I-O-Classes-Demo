import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriterDemo2 {
  public static void main(String[] args) throws FileNotFoundException {
    try (PrintWriter pw = new PrintWriter(new FileOutputStream("output.txt"))) {
      double v[] = {2.120000, 5.330000, 8.660000, 9.800000, 7.40000};
      int i;

      for (i = 0; i < v.length; i++)
        pw.printf("%.2f\n", v[i]);
    }
  }
}