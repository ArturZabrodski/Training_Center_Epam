package epam.tasks_3.stringbuilder.t2;

/**
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 */

public class AddCharB {

  public static void main(String[] args) {

    String str = "Strings and basics of text processing";
    System.out.println(str);
    String newStr = insertBAfterA(str);
    System.out.println(newStr);
  }

  public static String insertBAfterA(String str) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a') {
        stringBuilder.append("ab");
      } else {
        stringBuilder.append(str.charAt(i));
      }
    }
    return stringBuilder.toString();
  }
}
