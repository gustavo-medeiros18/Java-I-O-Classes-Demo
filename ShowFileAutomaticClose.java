import java.io.*;

public class ShowFileAutomaticClose {
  public static void main(String[] args) {
    int i = 0;

    try (FileInputStream fin = new FileInputStream("teste.txt")) {
      while (i != -1) {
        i = fin.read();

        if (i != -1)
          System.out.print((char) i);
      }
    }

    catch (IOException exc) {
      System.out.println("I/O Exception: " + exc);
    }
  }
}