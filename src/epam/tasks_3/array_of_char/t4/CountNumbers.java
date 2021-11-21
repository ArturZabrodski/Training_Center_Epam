package epam.tasks_3.array_of_char.t4;

/**
 * 4. В строке найти количество чисел.
 */

public class CountNumbers {

  public static void main(String[] args) {
    System.out.println("Количество чисел = " + numberOfNumbers("24 october 2021"));
    System.out.println("Количество чисел = " + numberOfNumbers("24/10/2021-Java 11"));
    System.out.println("Количество чисел = " + numberOfNumbers("23:31 sunday 24.10.2021"));
  }

  public static int numberOfNumbers(String str) {
    int result = 0;
    boolean counter = false;
    for (int i = 0; i < str.length(); i++) {
      // checking the symbols on the table ASCII
      if ((int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57 && !counter) {
        counter = true;
        result++;
      } else if ((int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57 && counter) {
        continue;
      } else {
        counter = false;
      }
    }
    System.out.println("В строке: " + str);
    return result;
  }
}