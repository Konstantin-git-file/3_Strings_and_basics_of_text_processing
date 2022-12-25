package Java0Tutor.WorkingWithStringOrStringBuilder.Task07;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static String deleteRepeatedChar(String str) {
//`    7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde def", то должно быть выведено "abcdef".

        Set<Character> linkedHashSet = IntStream
                .range(0, str.length())
                .mapToObj(str::charAt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        String sb = linkedHashSet.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        return sb;
    }

    public static void main(String[] args) {

        String line =
                "Вводится строка. Требуется удалить из нее повторяющиеся " +
                        "символы и все пробелы. Например, если было введено \"abc cde def\", то должно быть выведено \"abcdef";
        System.out.println(deleteRepeatedChar(line));
    }
}

