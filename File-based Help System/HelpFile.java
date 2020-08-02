import java.io.*;

class HelpFile {
  String helpfile; //name of the help file

  public HelpFile(String fname) {
    this.helpfile = fname;
  }

  public boolean helpOn(String what) {
    int ch = 0;
    String topic = "", info = "";

    try (BufferedReader br = new BufferedReader(new FileReader("helpfile.txt"))) {
      while (ch != -1) {
        ch = br.read();

        if (ch == '#') {
          topic = br.readLine();

          if (what.compareTo(topic) == 0) { //Founded topic
            while ((info != null) && (info.compareTo("#end") != 0)) {
              info = br.readLine();

              if (info.compareTo("#end") != 0)
                System.out.println(info);
            }

            System.out.println();
            
            return true;
          }
        }
      }
    }

    catch (IOException exc) {
      System.out.println("I/O error: " + exc);
    }

    return false;
  }

  public String getSelection() {
    String topic = "";

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter a topic:");

    try {
      topic = br.readLine();
    }

    catch (IOException exc) {
      System.out.println("Error while reading console");
    }

    finally {
      return topic;
    }
  }
}