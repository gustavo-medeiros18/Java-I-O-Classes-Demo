import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo1 {
  public static void main(String[] args) {
    double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25}, d;

    try (RandomAccessFile raf = new RandomAccessFile("random.data", "rw")) {
      for (int i = 0; i < data.length; i++) //gravacao dos dados
        raf.writeDouble(data[i]);

      raf.seek(0); //posiciona o ponteiro na pos. do 1º valor

      d = raf.readDouble();

      System.out.println("First value is " + d);

      raf.seek(8); //Posiciona o ponteiro na pos. do 2º valor

      d = raf.readDouble();

      System.out.println("Second value is " + d);

      raf.seek(8 * 3); //Posiciona o ponteiro na pos. do 4º valor

      d = raf.readDouble();

      System.out.println("Fourth value is " + d);
      System.out.println();
      System.out.println("Here is all the values: ");
      
      for (int i = 0; i < data.length; i++) {
        raf.seek(8 * i); //Posiciona o ponteiro na pos. de cada valor

        d = raf.readDouble();

        System.out.print(d + " ");
      }
    }

    catch (IOException exc) {
      System.out.println("I/O Exception: " + exc);
    }
  }
}