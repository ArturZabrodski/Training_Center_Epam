package epam.tasks_3.array_of_char.t3;

/**
 * 3. В строке найти количество цифр.
 */

public class CountDigits {

  public static void main(String[] args) {
    System.out.println("Количество цифр = " + numberOfDigits("24 october 2021"));
    System.out.println("Количество цифр = " + numberOfDigits("Java 11"));
  }

  public static int numberOfDigits(String str) {
    int result = 0;
    for (int i = 0; i < str.length(); i++) {
      // checking the symbols on the table ASCII
      if ((int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57) {
        result++;
      }
    }
    System.out.println("В строке: " + str);
    return result;
  }
}
