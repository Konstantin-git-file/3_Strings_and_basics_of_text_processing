package Java0Tutor.WorkingWithString.Task04;

public class Main {
    private static int countNumber(String str) {

//4. В строке найти количество чисел.

        int counter = 0;
        boolean number = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                number = true;
            }
            if (!Character.isDigit(str.charAt(i)) && number) {
                counter++;
                number = false;
            }
        }
        if (number) {
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
