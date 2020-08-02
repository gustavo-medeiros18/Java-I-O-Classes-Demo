public class FileHelp {
  public static void main(String[] args) {
    HelpFile help = new HelpFile("helpfile.txt");

    String topic = "";

    System.out.println("Try the help system. Type 'stop' to end.");

    while (topic.compareTo("stop") != 0) {
      topic = help.getSelection();

      if (!help.helpOn(topic))
        System.out.println("Topic not found");
    }
  }
}