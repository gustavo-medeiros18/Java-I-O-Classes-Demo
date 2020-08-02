import java.io.*;
import java.io.FileOutputStream;

public class BinaryCopyFile {
  public static void main(String[] args) {
    try (DataInputStream din = new DataInputStream(new FileInputStream("data"));
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("datacopy"))) {

      while (din.readInt() != 0)
        dout.writeInt(din.readInt());
    }

    catch (EOFException exc) {
      System.out.println("EOFException: " + exc);
    }

    catch (IOException exc) {
      System.out.println("Process finished");
    }

    finally {
      System.out.println("File copied successfuly");
    }
  }
}