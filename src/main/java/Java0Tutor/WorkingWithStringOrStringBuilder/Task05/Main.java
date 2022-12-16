package Java0Tutor.WorkingWithStringOrStringBuilder.Task05;

import java.util.stream.IntStream;

public class Main {
    private static int countA(String str, char a) {
//    5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
        return (int) IntStream
                .range(0, str.length())
                .filter(i -> str.charAt(i) == a)
                .count();
    }

    public static void main(String[] args) {

        String line =
                "13 Dec 2022  " + "Semi  - final " + "  ARGENTINA " + "3 - 0" + "   CROATIA\n" +
                        "14 Dec 20    22       " + "Semi-final" + "       FRANCE    " + "2      - 0" + "  MOROCCO\n" +
                        "Play   -   off for third place " + "   CROATIA      " + "MOROCCO";
        System.out.println(countA(line, 'a'));
    }
}

