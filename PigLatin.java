import java.util.*;
public class PigLatin {
  public static void main (String[] args) {
    Scanner l = new Scanner (System.in);
    while (l.hasNext()) {
      String line = l.nextLine();
      System.out.println(pigLatin(line));
    }
  }

  public static String pigLatinSimple (String s) {
    String sentence = ""; // will hold whole modified line

    Scanner w = new Scanner(s);

    while (w.hasNext()) {
      String changed = ""; // changed ver of mod word
      String toTest = w.next(); // word to mod
      String wTest = toTest.toLowerCase(); // lowercase of mod word

      if (wTest.charAt(0) == 'a' || wTest.charAt(0) == 'e' || wTest.charAt(0) == 'i' ||
          wTest.charAt(0) == 'o' || wTest.charAt(0) == 'u') {
        for (int i = 0; i < wTest.length(); i++) {
          changed += wTest.substring(i, i + 1);
        }
        changed += "hay ";
      }
      else {
        for (int i = 1; i < wTest.length(); i++) {
          changed += wTest.substring(i, i + 1);
        }
        changed += wTest.substring(0, 1);
        changed += "ay ";
      }
      sentence += changed;
    }
    return sentence;
  }

  public static String pigLatin (String s) {
    String[] diagraphs =  {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr",
                           "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc",
                           "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th",
                           "tr", "tw", "wh", "wr"};
    String sentence = ""; // will hold whole modified line

    Scanner w = new Scanner(s);

    while (w.hasNext()) {
      String changed = ""; // changed ver of mod word
      String toTest = w.next(); // word to mod
      String wTest = toTest.toLowerCase(); // lowercase of mod word

      if (wTest.charAt(0) == 'a' || wTest.charAt(0) == 'e' || wTest.charAt(0) == 'i' ||
          wTest.charAt(0) == 'o' || wTest.charAt(0) == 'u') {
        for (int i = 0; i < wTest.length(); i++) {
          changed += wTest.substring(i, i + 1);
        }
        changed += "hay ";
      }
      else if (wTest.length() >= 2 && Arrays.asList(diagraphs).contains(wTest.substring(0, 2))) {
        for (int i = 2; i < wTest.length(); i++) {
          changed += wTest.substring(i, i + 1);
        }
        changed += wTest.substring(0, 2);
        changed += "ay ";
      }
      else {
        for (int i = 1; i < wTest.length(); i++) {
          changed += wTest.substring(i, i + 1);
        }
        changed += wTest.substring(0, 1);
        changed += "ay ";
      }
      sentence += changed;
    }
    return sentence;
  }
}
