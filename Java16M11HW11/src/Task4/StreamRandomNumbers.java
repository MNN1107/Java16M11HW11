package task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRandomNumbers{
    public static void main(String[] args){
        RandomNumbers randomNumbers = new RandomNumbers();
        Stream<Long> iterate = Stream.iterate(25l, seed-> randomNumbers.withSeed(seed).next());

        List<Long> collect = iterate
                .peek(System.out::println)
                .limit(10)
                .collect(Collectors.toList());
    }
}
