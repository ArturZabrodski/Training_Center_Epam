package epam.tasks_1.cycles.t7;

import java.util.Scanner;

/**
 * 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
 * самого числа. m и n вводятся с клавиатуры.
 */

public class NumberDivisors {

  public static void main(String[] args) {

    System.out.println("Введите числа [m, n]: ");

    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    sc.close();

    for (; m <= n; m++) {
      int value = m / 2;
      boolean count = false;
      for (int i = 2; i <= value; i++) {
        if (m % i == 0) {
          if (!count) {
            System.out.format("\nДелители числа %d:\n", m);
            count = true;
          }
          System.out.print(i + "; ");
        }
      }
    }
  }
}
