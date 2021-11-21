package epam.tasks_1.branching.t2;

import java.util.Scanner;

/**
 * 2. Найти max{min(a, b), min(c, d)}.
 */

public class MaxMin {

  public static void main(String[] args) {

    System.out.println("Введите числа a, b, c, d:");

    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = sc.nextDouble();
    sc.close();

    double max = funcMax(funcMin(a, b), funcMin(c, d));

    System.out.println("max{min(a, b), min(c, d)} = " + max);
  }

  public static double funcMin(double x, double y) {
    return x <= y ? x : y;
  }

  public static double funcMax(double x, double y) {
    return x >= y ? x : y;
  }
}