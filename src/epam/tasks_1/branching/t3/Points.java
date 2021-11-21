package epam.tasks_1.branching.t3;

import java.util.Scanner;

/**
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной
 * прямой.
 */

public class Points {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Введите А(х1,у1):");
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();

    System.out.println("Введите В(х2,у2):");
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();

    System.out.println("Введите С(х3,у3):");
    int x3 = sc.nextInt();
    int y3 = sc.nextInt();
    sc.close();

    if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
      System.out.format("Точки А(%d,%d), В(%d,%d) и С(%d,%d) расположены на одной прямой",
          x1, y1, x2, y2, x3, y3);
    } else {
      System.out.format("Точки А(%d,%d), В(%d,%d) и С(%d,%d) не расположены на одной прямой",
          x1, y1, x2, y2, x3, y3);
    }
  }
}
