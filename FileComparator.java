import java.io.*;

public class FileComparator {
  public static void main(String[] args) {
    int i = 0, j = 0;

    try (FileInputStream f1 = new FileInputStream("teste.txt"); FileInputStream f2 = new FileInputStream("copia.txt")) {
      while (i != -1 && j != -1) {
        i = f1.read();
        j = f2.read();

        if (i != j)
          break;
      }

      if (i != j)
        System.out.println("The files are different");
      else
        System.out.println("The files have the same content");
    }

    catch (IOException exc) {
      System.out.println("I/O Exception: " + exc);
    }
  }
}