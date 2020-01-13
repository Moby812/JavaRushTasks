package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
6. У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
7. У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
8. У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
9. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
10. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
*/

public class Cat {
    //напишите тут ваш код
    private String name, address, color;
    private int age, weight;

    public Cat(String name) {
        this.name = name;
        this.color = "Black";
        this.age = 5;
        this.weight = 5;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.color = "Black";
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.color = "Black";
        this.age = age;
        this.weight = 5;
    }

    public Cat(int weight, String color) {
        this.color = color;
        this.age = 5;
        this.weight = weight;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 5;
    }

    public static void main(String[] args) {

    }
}
