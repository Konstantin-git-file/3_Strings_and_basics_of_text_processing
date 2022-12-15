package Java0Tutor.WorkingWithString.Task05;

public class Main {
    private static String trimSpaces(String str) {

//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.

       return str.trim().replaceAll(" +", " ");
    }

    public static void main(String[] args) {
        String line =
                "13 Dec 2022  " + "Semi  - final " + "  ARGENTINA " + "3 - 0" + "   CROATIA\n" +
                        "14 Dec 20    22       " + "Semi-final" + "       FRANCE    " + "2      - 0" + "  MOROCCO\n" +
                        "Play   -   off for third place " + "   CROATIA      " + "MOROCCO";
        System.out.println(trimSpaces(line));
    }
}
