import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo2 {
  public static void main(String[] args) {
    int data[] = {14, 19, 18, 25, 16, 20}, i;

    try (RandomAccessFile raf = new RandomAccessFile("random.data", "rw")) {
      for (i = 0; i < data.length; i++)
        raf.writeInt(data[i]);
      
      raf.seek(0);

      System.out.println("First number is " + raf.readInt());

      raf.seek(4);

      System.out.println("Second number is " + raf.readInt());

      raf.seek(12);

      System.out.println("Fourth number is " + raf.readInt());
      System.out.println();
      System.out.print("This are all the numbers written in the file: ");

      for (i = 0; i < data.length; i++) {
        raf.seek(4 * i);

        System.out.println(raf.readInt());
      }
    }

    catch (IOException | SecurityException exc) {
      System.out.println("An exception has occurred: " + exc);
    }
  }
}