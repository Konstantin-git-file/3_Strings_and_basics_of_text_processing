package Java0Tutor.WorkingWithStringOrStringBuilder.Task01;

public class Main {
    private static int findNumberOfSpaces(String str) {
//    1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
        int count= 0;
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        return maxCount;
    }


    public static void main(String[] args) {
        String line =
                "13 Dec 2022  " + "Semi  - final " + "  ARGENTINA " + "3 - 0" + "   CROATIA\n" +
                        "14 Dec 20    22       " + "Semi-final" + "       FRANCE    " + "2      - 0" + "  MOROCCO\n" +
                        "Play   -   off for third place " + "   CROATIA      " + "MOROCCO";
        System.out.println(findNumberOfSpaces(line));
    }
}

