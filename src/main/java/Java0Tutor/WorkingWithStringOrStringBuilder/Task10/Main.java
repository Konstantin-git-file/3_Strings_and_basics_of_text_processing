package Java0Tutor.WorkingWithStringOrStringBuilder.Task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static void countSentences(String str) {
//`    10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
// восклицательным или вопросительным знаком. Определить количество предложений в строке X.

        String pattern = "([.!?])";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println("Количество предложений : " + count);
    }

    public static void main(String[] args) {

        String line =
                "In addition to the JPA-specific annotations, you’ll also note that you’ve added a  @NoArgsConstructor annotation at the class level. JPA requires that entities have a noarguments\n" +
                        "constructor, so Lombok’s @NoArgsConstructor does that for you. You don’t want to be able to use it, though, so you make it private by setting the access\n" +
                        "attribute to AccessLevel.PRIVATE? And because there are final properties that must be set, you also set the force attribute to true, which results in the Lombok-generated\n" +
                        "constructor setting them to null!";
        countSentences(line);
    }
}

