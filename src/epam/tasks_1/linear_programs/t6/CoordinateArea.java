package epam.tasks_1.linear_programs.t6;

import java.util.Scanner;

/**
 * 6. Для данной области составить линейную программу, которая печатает true, если точка с
 * координатами (х, у) принадлежит закрашенной области, и false — в противном случае.
 */

public class CoordinateArea {

  public static void main(String[] args) {

    System.out.println("Введите x и y:");

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    sc.close();

    // выколотая точка (0;-1)
    if ((x == 0) && (y == -1)) {
      System.out.println(false);
    } else if (((x >= -4) && (x <= 4) && (y >= -3) && (y <= 0)) ||
        ((x >= -2) && (x <= 2) && (y >= 0) && (y <= 4))) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }
}

