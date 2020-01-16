package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
4. Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
5. Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
*/

public class Cat {
    public static void main(String[] args) {

    }

    //напишите тут ваш код
    protected void finalize() throws Throwable {
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    //напишите тут ваш код
    protected void finalize() throws Throwable {
        System.out.println("A Dog was destroyed");
    }
}
