import java.util.*;
public class MakeStars {
  public static void main (String[] args) {
    Scanner l = new Scanner(System.in);


    while (l.hasNextLine()) {
      String lineToStar = l.nextLine();

      Scanner w = new Scanner (lineToStar);

      String staredWord = "";
      while (w.hasNext()) {
        String wordToStar = w.next();

        for (int i = 0; i < wordToStar.length(); i++) {
          staredWord += "*";
        }

        staredWord = staredWord + " ";
      }
      System.out.println(staredWord);
    }
  }
}
