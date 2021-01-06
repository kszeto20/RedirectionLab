import java.util.*;
public class PigLatin {
  public static void main (String[] args) {
    Scanner l = new Scanner (System.in);
    while (l.hasNext()) {
      String line = l.nextLine();
      System.out.println(pigLatinBest(line));
    }
  }

  public static String pigLatinSimple (String s) {
    String[] vowels = {"a", "e", "i", "o", "u"};
    String sentence = ""; // will hold whole modified line

    Scanner w = new Scanner(s);

    while (w.hasNext()) {
      String changed = ""; // changed ver of mod word
      String toTest = w.next(); // word to mod
      String wTest = toTest.toLowerCase(); // lowercase of mod word

      if (Arrays.asList(vowels).contains(wTest.substring(0, 1))) {
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
    String[] vowels = {"a", "e", "i", "o", "u"};
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

      if (Arrays.asList(vowels).contains(wTest.substring(0, 1))) {
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

  public static String pigLatinBest (String s) {
    String[] vowels = {"a", "e", "i", "o", "u"};
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
      String punc = "";

      if (!(Character.isLetter(wTest.charAt(0)))) {
        changed = wTest + " ";
        sentence += changed;
      }
      else {
          if (!(Character.isLetter((wTest.charAt(wTest.length() - 1))))) {
            punc = wTest.substring(wTest.length() - 1);
            wTest = wTest.substring(0, wTest.length() - 1);
          }
          if (Arrays.asList(vowels).contains(wTest.substring(0, 1))) {
            for (int i = 0; i < wTest.length(); i++) {
              changed += wTest.substring(i, i + 1);
            }
            changed = changed + "hay" + punc + " ";
          }
          else if (wTest.length() >= 2 && Arrays.asList(diagraphs).contains(wTest.substring(0, 2))) {
            for (int i = 2; i < wTest.length(); i++) {
              changed += wTest.substring(i, i + 1);
            }
            changed += wTest.substring(0, 2);
            changed = changed + "ay" + punc + " ";
          }
          else {
            for (int i = 1; i < wTest.length(); i++) {
              changed += wTest.substring(i, i + 1);
            }
            changed += wTest.substring(0, 1);
            changed = changed + "ay" + punc + " ";
          }
          sentence += changed;
        }
      }
      return sentence;
    }
  }
      /*
      if (Character.isLetter((wTest.charAt(0)))) {
        if (!(Character.isLetter((wTest.charAt(wTest.length() - 1))))) {
          punc = wTest.substring(wTest.length() - 1);
          wTest = wTest.substring(0, wTest.length() - 1);
        }
        if (Arrays.asList(vowels).contains(wTest.substring(0, 1))) {
          for (int i = 0; i < wTest.length(); i++) {
            changed += wTest.substring(i, i + 1);
          }
          changed += "hay ";
          changed += punc;
          changed += " ";
        }
        else if (wTest.length() >= 2 && Arrays.asList(diagraphs).contains(wTest.substring(0, 2))) {
          for (int i = 2; i < wTest.length(); i++) {
            changed += wTest.substring(i, i + 1);
          }
          changed += wTest.substring(0, 2);
          changed += "ay ";
          changed += punc;
          changed += " ";
        }
        else {
          for (int i = 1; i < wTest.length(); i++) {
            changed += wTest.substring(i, i + 1);
          }
          changed += wTest.substring(0, 1);
          changed += "ay ";
          changed += punc;
          changed += " ";
        }
        sentence += changed;
      }
      */
