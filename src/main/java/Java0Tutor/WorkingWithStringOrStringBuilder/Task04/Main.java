package Java0Tutor.WorkingWithStringOrStringBuilder.Task04;

public class Main {
    private static String makeCake(String str) {
//    4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
        var cake = String.valueOf(str.charAt(str.indexOf('т')));
        for (char c : new char[]{'о', 'р', 'т'}) {
            cake += String.valueOf(str.charAt(str.indexOf(c)));
        }
        return cake;
    }


    public static void main(String[] args) {
        String word =
                "информатика";
        System.out.println(makeCake(word));
    }
}

