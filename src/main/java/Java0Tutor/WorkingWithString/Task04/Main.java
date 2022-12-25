package Java0Tutor.WorkingWithString.Task04;

public class Main {
    private static int countNumber(String str) {

//4. В строке найти количество чисел.

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        String line =
                "13 Dec 2022" + "Semi-final" + "ARGENTINA" + "3 - 0" + "CROATIA\n" +
                        "14 Dec 2022" + "Semi-final" + "FRANCE" + "2 - 0" + "MOROCCO\n" +
                        "Play-off for third place" + "CROATIA" + "MOROCCO";
        System.out.println(countNumber(line));
    }
}
