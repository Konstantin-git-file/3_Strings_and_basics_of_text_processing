package Java0Tutor.WorkingWithString.Task03;

public class Main {
    private static int countDigits(String str) {

//3. В строке найти количество цифр.

        int digits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits++;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        String line =
                "13 Dec 2022" + "Semi-final" + "ARGENTINA" + "3 - 0" + "CROATIA\n" +
                "14 Dec 2022" + "Semi-final" + "FRANCE" + "2 - 0" + "MOROCCO\n" +
                "Play-off for third place" + "CROATIA" + "MOROCCO";
        System.out.println(countDigits(line));
    }
}
