package epam.tasks_1.cycles.t4;

import java.math.BigInteger;

/**
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class MultiplicationOfSquares {

  public static void main(String[] args) {

    BigInteger result = new BigInteger("1");

    for (int i = 2; i <= 200; i++) {
      result = result.multiply(BigInteger.valueOf((long) Math.pow(i, 2)));
    }

    System.out.println("Произведение квадратов первых двухсот чисел = " + result);
  }
}
