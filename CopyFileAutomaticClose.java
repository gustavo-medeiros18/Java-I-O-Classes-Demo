import java.io.*;

public class CopyFileAutomaticClose {
  public static void main(String[] args) {
    int i = 0;

    try (FileInputStream fin = new FileInputStream("teste.txt");
         FileOutputStream fout = new FileOutputStream("copia.txt")) {

      while (i != -1) {
        i = fin.read();

        if (i != -1)
          fout.write(i);
      }
    }

    catch (IOException exc) {
      System.out.println("I/O exception: " + exc);
    }

    finally {
      System.out.println("File copied succesfully");
    }
  }
}