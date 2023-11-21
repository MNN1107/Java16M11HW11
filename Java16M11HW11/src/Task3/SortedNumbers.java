package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedNumbers {
    public static void main(String[] args){
        List<String> numbers =
                Arrays.asList("1, 2, 0", "4, 5");

        String result = getSortedNumbers(numbers);
        System.out.println("Відсортовані числа: "  + result);
    }
    public static String getSortedNumbers(List<String> numbers){
        return numbers.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s*,\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
