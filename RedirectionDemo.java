import java.util.*;
public class RedirectionDemo{
  public static void main( String[]args ){

      Scanner n = new Scanner(System.in);

      System.out.println("scanner ok");

      while (n.hasNextLine()) {
        String wordToPrint = n.nextLine();
        System.out.println(wordToPrint);
      }
  }
}
