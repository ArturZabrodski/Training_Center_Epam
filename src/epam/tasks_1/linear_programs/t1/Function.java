package epam.tasks_1.linear_programs.t1;

import java.util.Scanner;

/**
 * 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

public class Function {

  public static void main(String[] args) {
    System.out.println("Введите a, b и c:");

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();

    int z = ((a - 3) * b / 2) + c;

    System.out.println("Значение функции z = " + z);
  }
}
