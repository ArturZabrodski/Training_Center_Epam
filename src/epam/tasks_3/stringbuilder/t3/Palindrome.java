package epam.tasks_3.stringbuilder.t3;

/**
 * 3. Проверить, является ли заданное слово палиндромом
 */

public class Palindrome {

  public static void main(String[] args) {

    String[] strArray = {"Anna", "Translator", "Radar", "Repaper", "Palindrome", "Level"};

    for (String word : strArray) {
      if (isPalindrome(word)) {
        System.out.println(word + " - палиндром");
      } else {
        System.out.println(word + " - не палиндром");
      }
    }
  }

  public static boolean isPalindrome(String word) {
    for (int i = 0; i < word.length() / 2; i++) {
      String startSymbol = String.valueOf(word.charAt(i));
      String endSymbol = String.valueOf(word.charAt(word.length() - ++i));
      if (!startSymbol.equalsIgnoreCase(endSymbol)) {
        return false;
      }
    }
    return true;
  }
}
