package Java0Tutor.WorkingWithStringOrStringBuilder.Task03;

public class Main {
    private static Boolean isPalindrome(String str) {
//    3. Проверить, является ли заданное слово палиндромом.
        var word = str.replaceAll("\\s+","");
        var reverse = new StringBuffer(word).reverse().toString();
        return reverse.equalsIgnoreCase(word);
    }


    public static void main(String[] args) {
        String line =
                "ARGENTINA";
        System.out.println(isPalindrome(line));
    }
}

