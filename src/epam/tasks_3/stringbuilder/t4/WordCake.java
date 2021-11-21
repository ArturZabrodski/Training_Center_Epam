package epam.tasks_3.stringbuilder.t4;

/**
 * 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика”
 * слово “торт”.
 */

public class WordCake {

  public static void main(String[] args) {

    System.out.println(composeWord("информатика"));
  }

  public static String composeWord(String informatics) {
    String cake = "";
    cake = cake.concat(String.valueOf(informatics.charAt(informatics.indexOf('т'))));
    cake = cake.concat(String.valueOf(informatics.charAt(informatics.indexOf('о'))));
    cake = cake.concat(String.valueOf(informatics.charAt(informatics.indexOf('р'))));
    cake = cake.concat(String.valueOf(informatics.charAt(informatics.indexOf('т'))));
    return cake;
  }
}
