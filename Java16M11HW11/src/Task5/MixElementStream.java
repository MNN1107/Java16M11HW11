package Task5;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


public class MixElementStream {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("Iryna", "Andriy", "Oleksa", "Oksana", "Mykhailo", "Hryhoriy", "Halyna");
        Stream<String> second = Stream.of("Mykola", "Ivan", "Olena", "Hanna");

        Stream<String> mixElementStream = zip(first, second);
        mixElementStream.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        Iterator<T> zippingIterator = new Iterator<>() {
            public boolean isFirstStream = true;

            @Override
            public boolean hasNext() {
                return isFirstStream ? iterator1.hasNext() : iterator2.hasNext();
            }

            @Override
            public T next() {
                T element = isFirstStream ? iterator1.next() : iterator2.next();
                isFirstStream = !isFirstStream; 
                return element;
            }
        };

        Iterable<T> iterable = () -> zippingIterator;
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
