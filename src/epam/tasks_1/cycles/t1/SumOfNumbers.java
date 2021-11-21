package epam.tasks_1.cycles.t1;

import java.util.Scanner;

/**
 * 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа
 * суммирует все числа от 1 до введенного пользователем числа.
 */

public class SumOfNumbers {

  public static void main(String[] args) {

    int sum = 0;

    System.out.println("Введите целое положительное число: ");

    Scanner sc = new Scanner(System.in);
    int value = sc.nextInt();
    sc.close();

    for (int i = 1; i <= value; i++) {
      sum += i;
    }

    System.out.format("Сумма чисел от 1 до %d = %d", value, sum);
  }
}


