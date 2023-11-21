package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NamesOddIndex {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Iryna", "Andriy", "Oleksa", "Oksana", "Mykhailo", "Hryhoriy", "Halyna");
        System.out.println("Список імен: " + names);

        String result = getNamesOddIndex(names);
        System.out.println("Імена з непарними індексами: " + result);
    }
    public static String getNamesOddIndex(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }


}

