package Java0Tutor.WorkingWithStringOrStringBuilder.Task09;

public class Main {
    private static void countLetters(String str) {
//`    9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.

        int upper = 0;
        int lower = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                upper++;

            if (Character.isLowerCase(str.charAt(i)))
                lower++;
        }
        System.out.println("Количество строчных (маленьких) букв : " + lower);
        System.out.println("Количество прописных (больших) букв : " + upper);
    }

    public static void main(String[] args) {

        String line =
                "Spring’s dependency inJection wirEs an Appropriate bEan inTo the Marked class meMber.";
        countLetters(line);
    }
}

