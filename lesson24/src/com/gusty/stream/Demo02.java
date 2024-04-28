package com.gusty.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo02 {
    public static void main(String[] args) {
        /*1.针对集合:Collection中的方法
        Stream<E> stream()*/
        ArrayList<String> list = new ArrayList<>();
        list.add("大雄");
        list.add("胖虎");
        list.add("小夫");
        Stream<String> stream = list.stream();
        System.out.println(stream);


        /*2.针对数组:Stream接口中的静态方法:
        static <T> Stream<T> of(T... values)*/
        Stream<String> stream1 = Stream.of("鳴人", "佐助", "小櫻");
        System.out.println(stream1);

        /*AtomicInteger count = new AtomicInteger(0);
        stream.peek(s -> count.incrementAndGet())
                .forEach(System.out::println);
        //System.out::println 等於 s-> System.out.println();
        System.out.println("Count: " + count.get());*/

        List<String> list2 =  stream.collect(Collectors.toList());
        System.out.println(list2);

    }
}
