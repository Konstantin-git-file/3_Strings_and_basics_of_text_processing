package Java0Tutor.WorkingWithStringOrStringBuilder.Task02;

public class Main {
    private static String addBafterA (String str) {
//    2. В строке вставить после каждого символа 'a' символ 'b'.
        return str.replaceAll("(?i)a","ab");
    }


    public static void main(String[] args) {
        String line =
                "13 Dec 2022  " + "Semi  - final " + "  ARGENTINA " + "3 - 0" + "   CROATIA\n" +
                        "14 Dec 20    22       " + "Semi-final" + "       FRANCE    " + "2      - 0" + "  MOROCCO\n" +
                        "Play   -   off for third place " + "   CROATIA      " + "MOROCCO";
        System.out.println(addBafterA(line));
    }
}

