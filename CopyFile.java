import java.io.*;

public class CopyFile {
  public static void main(String[] args) throws IOException{
    int i = 0;
    FileInputStream fin = null;
    FileOutputStream fout = null;

    try {
      fin = new FileInputStream("teste.txt");
      fout = new FileOutputStream("copia.txt");

      while (i != -1) {
        i = fin.read();

        if (i != -1)
          fout.write(i);
      }
    }

    catch (IOException exc) {
      System.out.println("I/O Exception: " + exc);
    }

    finally {
      try {
        if (fin != null)
          fin.close();
      }

      catch (IOException exc) {
        System.out.println("Error closing the input file");
      }

      try {
        if (fout != null)
          fout.close();
      }

      catch (IOException exc) {
        System.out.println("Error closing the output file");
      }
    }

    System.out.println("File copied succesfully");
  }
}