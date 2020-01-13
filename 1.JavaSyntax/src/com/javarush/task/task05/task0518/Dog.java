package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
1. У класса Dog должна быть переменная name с типом String.
2. У класса Dog должна быть переменная height с типом int.
3. У класса Dog должна быть переменная color с типом String.
*/


public class Dog {
    //напишите тут ваш код
    private String name, color;
    private int height;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Dog(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
