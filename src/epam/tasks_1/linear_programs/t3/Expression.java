package epam.tasks_1.linear_programs.t3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * (sinY + cosX) / (cosX - sinY) * tgXY
 */

public class Expression {

  public static void main(String[] args) {

    System.out.println("Введите x и y:");

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    sc.close();

    double value = Math.cos(x) - Math.sin(y);

    if (value == 0) {
      throw new IllegalArgumentException("Выражение (cos(x) - sin(y)) = 0. На ноль делить нельзя!");
    }

    double result = ((Math.sin(x) + Math.cos(y)) / value) * Math.tan(x * y);

    DecimalFormat dF = new DecimalFormat("#.####");
    System.out.println("Значение выражения = " + dF.format(result));
    System.out.println(value);
  }
}
