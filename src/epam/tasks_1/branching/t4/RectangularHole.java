package epam.tasks_1.branching.t4;

import java.util.Scanner;

/**
 * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли
 * кирпич через отверстие.
 */

public class RectangularHole {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Введите размеры прямоугольного отверстия: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("Введите размеры кирпича (х, у, z): ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    sc.close();

    if ((x <= a && y <= b) || (y <= a && x <= b) ||
        (x <= a && z <= b) || (z <= a && x <= b) ||
        (y <= a && z <= b) || (z <= a && y <= b)) {
      System.out.println("Кирпич пройдет через отверстие");
    } else {
      System.out.println("Кирпич не пройдет через отверстие");
    }
  }
}






