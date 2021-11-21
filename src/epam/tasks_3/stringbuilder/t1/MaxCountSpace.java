package epam.tasks_3.stringbuilder.t1;

/**
 * 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class MaxCountSpace {

  public static void main(String[] args) {

    System.out.println(maxSpaces("  Strings   and   basics   of    text    processing  "));  // max = 4
    System.out.println(maxSpaces("Strings  and  basics   of  text  processing "));           // max = 3
    System.out.println(maxSpaces("    Strings  and  basics   of  text  processing     "));   // max = 5
  }

  public static int maxSpaces(String str) {
    int max = 0;
    int maxResult = 0;
    int spaceCounter = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        spaceCounter++;
        max = spaceCounter;
        if (max > maxResult) {
          maxResult = max;
        }
      } else {
        spaceCounter = 0;
      }
    }
    return maxResult;
  }
}
