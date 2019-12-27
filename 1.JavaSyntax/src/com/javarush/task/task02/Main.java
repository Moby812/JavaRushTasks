package com.javarush.task.task02;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();                //создаём новый объект cat из класса Cat

        System.out.println(cat.name);       //обращаемся к переменной name у объекта cat
        changeName(cat);                    //вызываем метод changeName в котором меняем cat.name на Jerry
        System.out.println(cat.name);
    }

    public static void changeName(Cat cat) {
        cat.name = "Jerry";
    }

    public static class Cat {
        String name = "Tom";                //описание класса Cat
    }
}