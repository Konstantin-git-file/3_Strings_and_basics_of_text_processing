package Java0Tutor.WorkingWithString.Task02;

public class Main {
    private static String wordToLetter (String word) {

//2. Замените в строке все вхождения 'word' на 'letter'.

        StringBuilder strBuilder = new StringBuilder();
        String letter;
        for (int i = 0; i < word.length(); i++) {
            if (i + 3 < word.length() && word.charAt(i) == 'w'
                                      && word.charAt(i + 1) == 'o'
                                      && word.charAt(i + 2) == 'r'
                                      && word.charAt(i + 3) == 'd') {
                strBuilder.append("letter");
                i += 3;
            } else {
                strBuilder.append(word.charAt(i));
            }
        }
        letter = strBuilder.toString();
        return letter;
    }

    public static void main(String[] args) {
        String word = "We defined the BCryptPasswordEncoder to encode the password..";
        String letter = wordToLetter(word);
        System.out.println(word);
        System.out.println(letter);
    }
}
