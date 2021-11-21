package epam.tasks_1.linear_programs.t2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * ((b + √(b^2 + 4ac)) / 2a) − a^3c + b^(-2)
 */

public class Expression {

  public static void main(String[] args) {

    System.out.println("Введите a, b и c:");
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    if (a == 0) {
      throw new IllegalArgumentException("На ноль делить нельзя!");
    }

    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();

    double result = (((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a)
        - Math.pow(a, 3) * c + Math.pow(b, -2));

    DecimalFormat dF = new DecimalFormat("#.##");
    System.out.println("Значение выражения = " + dF.format(result));
  }
}
