package epam.tasks_3.stringbuilder.t9;

import java.io.IOException;
import java.util.Scanner;

/**
 * 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
 * Учитывать только английские буквы.
 */

public class NumberOfLetters {

  public static void main(String[] args) throws IOException {

    System.out.println("Введите строку слов, разделенных пробелами");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int countLowerCase = 0;
    int countUpperCase = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        countLowerCase++;
      } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        countUpperCase++;
      }
    }

    System.out.println("Количество строчных (маленьких) букв = " + countLowerCase);
    System.out.println("Количество прописных (больших) букв = " + countUpperCase);
  }
}
