package com.gusty.a_extends;

public class Test01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "gusty";
        teacher.age = 30;
        System.out.println(teacher.name);
        System.out.println(teacher.age);
        teacher.work();
        //子類繼承父類之後不能使用父類私有成員，只能使用父類非私有成員
        System.out.println("============================");

        Manager manager = new Manager();
        manager.name = "Faker";
        manager.age = 40;
        manager.work();
        System.out.println(manager.name);
        System.out.println(manager.age);
    }
}
