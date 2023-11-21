package task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedNames {
    public static void main(String[] args){
        List<String> names =
        Arrays.asList("Iryna", "Andriy", "Oleksa", "Oksana", "Mykhailo", "Hryhoriy", "Halyna");
        System.out.println("Список імен: " + names);

        List<String> sortedNames = names.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Cписок імен у верхньому регістрі і відсортованих за спаданням: " + sortedNames);

    }
}
