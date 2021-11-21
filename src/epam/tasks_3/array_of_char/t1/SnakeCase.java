package epam.tasks_3.array_of_char.t1;

/**
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
 */

public class SnakeCase {

  public static void main(String[] args) {
    String[] camelCase = {"equalsIgnoreCase", "valueOf", "regionMatches", "сompareTo", "charAt"};
    String[] snake_case = toSnakeCase(camelCase);

    for (int i = 0; i < camelCase.length; i++) {
      System.out.println(camelCase[i] + " - " + snake_case[i]);
    }
  }

  public static String[] toSnakeCase(String[] camelCase) {
    String[] snake_case = new String[camelCase.length];
    for (int i = 0; i < snake_case.length; i++) {
      StringBuilder stringBuilder = new StringBuilder();
      for (int j = 0; j < camelCase[i].length(); j++) {
        if (Character.isLowerCase(camelCase[i].charAt(j))) {
          stringBuilder.append(camelCase[i].charAt(j));
        } else {
          stringBuilder.append('_');
          stringBuilder.append(Character.toLowerCase(camelCase[i].charAt(j)));
        }
      }
      snake_case[i] = stringBuilder.toString();
    }
    return snake_case;
  }
}
