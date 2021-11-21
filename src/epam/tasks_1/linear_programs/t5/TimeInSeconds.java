package epam.tasks_1.linear_programs.t5;

import java.util.Scanner;

/**
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин
 * SSc.
 */

public class TimeInSeconds {

  public static void main(String[] args) {

    System.out.println("Введите натуральное число, обозначающее время в секундах: ");

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.close();

    int hour = t / 3600;
    int minute = (t - hour * 3600) / 60;
    int second = t - hour * 3600 - minute * 60;

    System.out.println("Значение времени: " + hour + " ч " + minute + " мин " + second + " c");

  }
}

