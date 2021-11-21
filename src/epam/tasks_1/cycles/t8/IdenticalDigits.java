package epam.tasks_1.cycles.t8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class IdenticalDigits {

  public static void main(String[] args) {
    System.out.println("Введите два числа: ");
    Scanner sc = new Scanner(System.in);
    String firstNumber = sc.nextLine();
    String secondNumber = sc.nextLine();

    Set<Character> hashSet = new HashSet<>();

    for (int i = 0; i < firstNumber.length(); i++) {
      for (int j = 0; j < secondNumber.length(); j++) {
        if (firstNumber.charAt(i) == secondNumber.charAt(j)) {
          hashSet.add(firstNumber.charAt(i));
          break;
        }
      }
    }
    System.out.println("Цифры, входящие в запись первого и второго числа: \n" + hashSet);
  }
}
