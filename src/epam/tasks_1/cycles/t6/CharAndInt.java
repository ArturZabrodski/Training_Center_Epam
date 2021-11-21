package epam.tasks_1.cycles.t6;

/**
 * 6. Вывести на экран соответствия между символами и их численными обозначениями в памяти
 * компьютера.
 */

public class CharAndInt {

  public static void main(String[] args) {

    for (int i = 0; i < 33; i++) {
      for (int j = i; j < 256; j += 32) {
        System.out.print((char) j + " - " + j + "   ");
      }
      System.out.println();
    }
  }
}
