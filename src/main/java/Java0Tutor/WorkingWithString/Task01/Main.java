package Java0Tutor.WorkingWithString.Task01;

public class Main {
    private static String [] camelCaseToSnakeCase(String [] camelCase) {
//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
        String [] snakeCase = new String[camelCase.length];
        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder strBuilder = new StringBuilder();
            for (int j = 0; j < camelCase[i].length(); j++) {
                char letter = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    strBuilder.append(letter);
                } else {
                    strBuilder.append("_");
                    strBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = strBuilder.toString();
        }
        return snakeCase;
    }

    public static void main(String[] args) {
        String [] camelCase = {"userService", "modelAttribute", "userNameNotFoundException",
                "customUserDetailsService", "userNameNotFoundException"};
        String [] snakeCase = camelCaseToSnakeCase(camelCase);

        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", snakeCase));
    }
}
