package epam.tasks_3.array_of_char.t2;

/**
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 */

public class WordToLetter {

  public static void main(String[] args) {
    String str = "the words in the text are as follows: word, text, wording.";
    System.out.println(str);
    System.out.println(changingTheWord(str));
  }

  public static String changingTheWord(String str) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if ((i < str.length() - 3) && (str.startsWith("word", i))) {
        stringBuilder.append("letter");
        i += 3;
      } else {
        stringBuilder.append(str.charAt(i));
      }
    }
    return stringBuilder.toString();
  }
}
