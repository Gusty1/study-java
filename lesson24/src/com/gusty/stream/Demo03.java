package com.gusty.stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo03 {
    public static void main(String[] args) {
        //方法引用
        Stream<String> stream = Stream.of("鳴人", "佐助", "小櫻");
        stream.forEach(System.out::println);
    }
}
