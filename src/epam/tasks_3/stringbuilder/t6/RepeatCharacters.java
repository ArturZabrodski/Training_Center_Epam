package epam.tasks_3.stringbuilder.t6;

/**
 * 6. Из заданной строки получить новую, повторив каждый символ дважды
 */

public class RepeatCharacters {

  public static void main(String[] args) {

    String string = "Strings and basics of text processing";
    System.out.println(string);
    String newString = repeatChar(string, 2);
    System.out.println(newString);
  }

  public static String repeatChar(String string, int value) {
    String newString = "";
    for (int i = 0; i < string.length(); i++) {
      for (int j = 0; j < value; j++) {
        newString = newString.concat(String.valueOf(string.charAt(i)));
      }
    }
    return newString;
  }
}
