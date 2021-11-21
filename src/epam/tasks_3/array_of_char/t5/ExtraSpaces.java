package epam.tasks_3.array_of_char.t5;

/**
 * 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на
 * одиночные пробелы. Крайние пробелы в строке удалить.
 */

public class ExtraSpaces {

  public static void main(String[] args) {
    System.out.println(removingSpaces("  Strings   and   basics   of    text    processing  "));
  }

  public static String removingSpaces(String str) {
    str = str.trim();
    StringBuilder stringBuilder = new StringBuilder();
    boolean spaceCounter = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ' && !spaceCounter) {
        stringBuilder.append(' ');
        spaceCounter = true;
      } else if (str.charAt(i) != ' ') {
        stringBuilder.append(str.charAt(i));
        spaceCounter = false;
      }
    }
    return stringBuilder.toString();
  }
}
