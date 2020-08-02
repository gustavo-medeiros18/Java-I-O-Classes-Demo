import java.io.*;

class ReadBytes {
  public static void main(String[] args){
    byte data[] = new byte[10];

    try {
      System.out.print("Enter some characters: ");
      System.in.read(data);
      System.out.print("You entered: ");
  
      for (int i = 0; i < data.length; i++)
        System.out.print((char) data[i]);
    }

    catch (IOException exc) {
      System.out.println("Exception caught");
    }    
  }
}