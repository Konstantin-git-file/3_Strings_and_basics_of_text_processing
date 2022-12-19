package Java0Tutor.WorkingWithStringOrStringBuilder.Task06;

import java.util.stream.IntStream;

public class Main {
    private static String repeatChar(String str) {
//`    6. Из заданной строки получить новую, повторив каждый символ дважды.
        String repeated = "";
        for (int i = 0; i < str.length(); i++) {
            repeated += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return repeated;
    }

    public static void main(String[] args) {

        String line =
                "13 Dec 2022  " + "Semi  - final " + "  ARGENTINA " + "3 - 0" + "   CROATIA\n" +
                        "14 Dec 20    22       " + "Semi-final" + "       FRANCE    " + "2      - 0" + "  MOROCCO\n" +
                        "Play   -   off for third place " + "   CROATIA      " + "MOROCCO";
        System.out.println(repeatChar(line));
    }
}

