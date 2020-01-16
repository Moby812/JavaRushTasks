package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
1. В классе Cat должен быть void метод finalize.
2. В классе Dog должен быть void метод finalize.
3. Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
4. Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
5. Метод main должен создавать 50000 объектов типа Cat и 50000 объектов типа Dog.
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        for (int i = 0; i < 50000; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
//            System.out.println("Созданы классы "+cat +dog);
//            System.out.println("Итераций циклов = "+ (i +1));     //(i +1) --т.к мы начинали считать с 0
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
