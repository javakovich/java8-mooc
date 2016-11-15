package lesson4;

import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

/**
 * Created by slazakovich on 11/11/2016.
 */
public class Lesson4 {

    public static void main(String[] args) {
        System.out.println(sumAndPrint(IntStream.of(2000_000_000, 2000_000_000)));
    }

    //doesn't compile, total should be final
   /* public static int sumAndPrint(IntStream intStream) {
        int total = 0;
        intStream.parallel()
                .peek(v -> total += v)
                .forEach(System.out::println);
        return total;
    }*/

      public static int sumAndPrint(IntStream intStream) {
        LongAdder total = new LongAdder();
        intStream.parallel()
                .peek(v -> total.add(v))
                .forEach(System.out::println);
        return total.intValue();
    }
}
