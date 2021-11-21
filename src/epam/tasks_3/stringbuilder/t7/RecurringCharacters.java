package epam.tasks_3.stringbuilder.t7;

/**
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

public class RecurringCharacters {

  public static void main(String[] args) {
    System.out.println(removeDuplicate("strings and basics of text processing"));
    System.out.println(removeDuplicate("abc cde def"));
  }

  public static String removeDuplicate(String str) {
    String newStr = "";
    str = str.trim();
    newStr = newStr.concat(String.valueOf(str.charAt(0)));
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) != ' ' && newStr.indexOf(str.charAt(i)) == -1) {
        newStr = newStr.concat(String.valueOf(str.charAt(i)));
      }
    }
    return newStr;
  }
}
