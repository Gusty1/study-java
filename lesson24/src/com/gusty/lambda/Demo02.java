package com.gusty.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("大雄", 20);
        Person person2 = new Person("小夫", 10);
        Person person3 = new Person("靜香", 30);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println("==================================");

        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(personList);

        System.out.println("==================================");

        personList.sort((Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
        System.out.println(personList);

        System.out.println("==================================");

        personList.sort((Person o1, Person o2) -> o1.getAge() - o2.getAge());
        System.out.println(personList);

    }
}
