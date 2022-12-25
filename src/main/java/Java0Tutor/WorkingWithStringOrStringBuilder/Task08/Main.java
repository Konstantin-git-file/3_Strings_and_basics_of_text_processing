package Java0Tutor.WorkingWithStringOrStringBuilder.Task08;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static String longestWord(String str) {
//`    8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.

        String longestWord = Arrays.stream(str.split(" "))
//                .filter(Objects::nonNull)
                .sorted()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        return longestWord;
    }

    public static void main(String[] args) {

        String line =
                "8. Вводится строка слов, разделенныхx пробелами. Найти самое длинное слово " +
                        "и вывести его на экран. Случай, когда самых длинных слов может быть несколько,  не обрабатывать";

        System.out.println(longestWord(line));
    }
}

