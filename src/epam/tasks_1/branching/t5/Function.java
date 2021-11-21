package epam.tasks_1.branching.t5;

import java.util.Scanner;

/**
 * 5. Вычислить значение функции:
 * x^2 - 3x + 9, если x <= 3;
 * 1 / (x^3 + 6), если x > 3.
 */

public class Function {

  public static void main(String[] args) {

    double x, y;

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите x: ");
    x = sc.nextInt();
    sc.close();

    if (x <= 3) {
      y = x * x - 3 * x + 9;
    } else {
      y = 1 / (Math.pow(x, 3) + 6);
    }

    System.out.format("Значение функции F(x) = %.4f", y);
  }
}
