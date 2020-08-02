import java.io.*;

public class BinaryFileComparator {
  public static void main(String[] args) {
    int x, y;

    try (DataInputStream din1 = new DataInputStream(new FileInputStream("data"));
    DataInputStream din2 = new DataInputStream(new FileInputStream("datacopy"))) {

      while (true) {
        x = din1.readInt();
        y = din2.readInt();

        if (x != y)
          break;
      }

      if (x != y)
        System.out.println("The files are different");
      else
        System.out.println("The files are the same");
    }

    catch (EOFException exc) {
      System.out.println("EOFException: " + exc);
    }

    catch (IOException exc) {
      System.out.println("IOException: " + exc);
    }
  }
}