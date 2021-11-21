package epam.tasks_1.branching.t1;

import java.util.Scanner;

/**
 * 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если
 * да, то будет ли он прямоугольным.
 */

public class Triangle {

  public static void main(String[] args) {

    System.out.println("Введите два угла треугольника в градусах:");

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    if ((a + b) < 180) {
      if ((a == 90) || (b == 90) || (a + b == 90)) {
        System.out.println("Треугольник существует и является прямоугольным");
      } else {
        System.out.println("Треугольник существует и не является прямоугольным");
      }
    } else {
      System.out.println("Треугольник не существует");
    }
  }
}
