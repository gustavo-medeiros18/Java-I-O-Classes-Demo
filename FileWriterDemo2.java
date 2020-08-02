import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
  public static void main(String[] args) throws IOException {
    int i;

    try (FileWriter fw = new FileWriter("output.txt")) {
      for (i = 0; i < 8; i++) {
        fw.write(Integer.toString(i));

        fw.write("\n");
      }
    }
  }
}