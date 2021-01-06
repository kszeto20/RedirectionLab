import java.util.*;
public class PigLatin {
  public static void main (String[] args) {
    Scanner l = new Scanner (System.in);
    while (l.hasNextLine()) {
      String line = l.nextLine();
      System.out.println(pigLatinSimple(line));
    }
  }

  public static String pigLatinSimple (String s) {

    Scanner w = new Scanner(s);
    String toTest = "";
    String changed = "";
    String sentence = "";
    String word = "";

    while (w.hasNext()) {
      toTest = w.next();
      String wTest = toTest.toLowerCase();

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
}


/*
    String retString = "";
    String retLine = "";

    Scanner w = new Scanner(s);

    while (w.hasNext()) {
      String word = w.next();
      String first = word.substring(0, 1).toLowerCase();


      if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u")) {
        for (int i = 0; i < word.length(); i++) {
          retString += word.substring(i, i + 1);
        }
        retString += "hay";
        }
      else {
        for (int i = 0; i < s.length(); i++) {
          retString += s.substring(i, i + 1);
        }
      }
      retLine += retString;
    }
    return retLine;
  }
}
--------------------------------------
    String[] vowels = new String[] {"a", "e", "i", "o", "u"};
    String toReturn = "";
    Scanner w = new Scanner(s);

    while (w.hasNext()) {
      String word = w.next();
      if (Arrays.asList(vowels).contains(s.substring(0, 1).toLowerCase())) {
        for (int i = 0; i < s.length(); i++) {
          toReturn += s.substring(i, i + 1);
        }
        toReturn += "hay";
      }
      else {
        toReturn = s;
      }
    }
      return toReturn;
  }
} */
