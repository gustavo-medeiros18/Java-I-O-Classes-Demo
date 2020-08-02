import java.io.*;

class ShowFile {
  public static void main(String[] args) {
    int i = 0;
    FileInputStream fin;

    try {
      fin = new FileInputStream("teste.txt"); //Abre o arquivo
    }

    catch (FileNotFoundException exc) {
      System.out.println("File not found");

      return;
    }

    try {
      while (i != -1) {
        i = fin.read();

        if (i != -1)
          System.out.print((char) i);
      }
    }

    catch (IOException exc) {
      System.out.println("Error loading file");
    }

    finally {
      try {
        fin.close(); //Fechamento do arquivo
      }

      catch (IOException exc) {
        System.out.println("Error closing file");
      }
    }
  }
}