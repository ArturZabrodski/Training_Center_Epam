package epam.tasks_1.linear_programs.t4;

import java.util.Scanner;

/**
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Replacement {

  public static void main(String[] args) {

    System.out.println("Введите действительное число вида (nnn.ddd):");

    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    sc.close();

    double r1 = r * 1000 % 1000;
    double r2 = (int) r;
    r2 /= 1000;
    r = r1 + r2;

    System.out.println("Полученное число вида (ddd.nnn):\n" + r);
  }
}
