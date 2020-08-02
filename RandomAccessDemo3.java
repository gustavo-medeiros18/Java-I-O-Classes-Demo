import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo3{
  public static void main(String[] args) {
    String s = "Naruto Uzumaki";

    try (RandomAccessFile raf = new RandomAccessFile("random.data", "rw")) {
      raf.writeChars(s);

      raf.seek(0);

      System.out.println(raf.readLine());
    }

    catch (IOException | SecurityException exc) {
      System.out.println("An exception has occurred: " + exc);
    }
  }
}