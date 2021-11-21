package epam.tasks_1.cycles.t5;

import java.util.Scanner;

/**
 * 5. Даны числовой ряд и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид: a(n) = 1 / 2^n + 1 / 3^n
 */

public class NumericalSeries {

  public static void main(String[] args) {

    double sum = 0;
    double e, a;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите значение \"e\":");
    e = Double.parseDouble(scanner.nextLine());

    for (int n = 1; n < 1000; n++) {
      a = 1 / (Math.pow(2, n)) + 1 / (Math.pow(3, n));
      if (a >= e) {
        sum += a;
      } else {
        break;
      }
    }
    System.out.format("Сумма членов ряда, модуль которых больше или равен числу %.2f = %.2f", e, sum);
  }
}
