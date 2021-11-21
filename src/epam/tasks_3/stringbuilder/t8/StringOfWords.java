package epam.tasks_3.stringbuilder.t8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

public class StringOfWords {

  public static void main(String[] args) {

//    String str = "I have English on Monday Wednesday and Thursday";

    System.out.println("Введите строку слов, разделенных пробелами");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    String[] words = str.split(" ");
    int maxIndex = 0;
    int count = 0;

    for (int i = 1; i < words.length; i++) {
      if (count < words[i].length()) {
        count = words[i].length();
        maxIndex = i;
      }
    }
    System.out.println("Самое длинное слово: " + words[maxIndex]);
  }
}

