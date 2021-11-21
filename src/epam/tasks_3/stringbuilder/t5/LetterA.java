package epam.tasks_3.stringbuilder.t5;

/**
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class LetterA {

  public static void main(String[] args) {

    System.out.println("Количество букв \"a\" = " +
        numberOfLettersA("Strings and basics of text processing"));
    System.out.println("Количество букв \"a\" = " +
        numberOfLettersA("Строки и основы обработки текста"));
  }

  public static int numberOfLettersA(String str) {
    int counterA = 0;
    for (int i = 0; i < str.length(); i++) {
      // english 'a' or russian 'а'
      if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'а'
          || str.charAt(i) == 'А') {
        counterA++;
      }
    }
    System.out.println("В строке: " + str);
    return counterA;
  }
}