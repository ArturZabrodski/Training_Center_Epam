package epam.tasks_1.cycles.t2;

import java.util.Scanner;

/**
 * 2. Вычислить значения функции на отрезке [а,b] c шагом h.
 * y = x, x > 2
 * y = -x, x <= 2
 */

public class Function {

  public static void main(String[] args) {

    System.out.println("Введите значения [а,b]  шагом h: ");

    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double h = sc.nextDouble();
    sc.close();

    System.out.println("Значения функции:");

    for (double x = a; x <= b; x += h) {
      if (x > 2) {
        System.out.println("y = " + x);
      } else {
        System.out.println("y = " + (-x));
      }
    }
  }
}
