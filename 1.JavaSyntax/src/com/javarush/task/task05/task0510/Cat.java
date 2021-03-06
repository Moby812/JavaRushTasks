package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name, address, color;
    private int age, weight;

    public void initialize(String name) {   //принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
        this.name = name;
        this.age = 5;
        this.weight = 5;
        this.color = "black";
    }

    public void initialize(String name, int weight, int age) {  //принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "black";
    }

    //успешеная валидация
    public void initialize(String name, int age) {  //принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "black";
    }

    public void initialize(int weight, String color) {  //принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
        this.age = 5;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {   //принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
