package epam.tasks_3.stringbuilder.t10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
 * восклицательным или вопросительным знаком. Определить количество предложений в строке X.
 */

public class CountOfSentences {

  public static void main(String[] args) {

    String x = "Do you like watching cartoons? Probably you do! But how did they come to be? "
        + "Who invented1 them? This is actually a very tough question. The first cartoons "
        + "were created long before the TV. For example, shadow play2 was a very popular "
        + "form of entertainment3 in ancient China. Such shows looked almost like modern "
        + "cartoons!";

    Pattern p = Pattern.compile("[a-zA-Z]+[.?!]");
    Matcher m = p.matcher(x);

    int count = 0;

    while (m.find()) {
      count++;
    }

    System.out.println("Количество предложений: " + count);
  }
}
