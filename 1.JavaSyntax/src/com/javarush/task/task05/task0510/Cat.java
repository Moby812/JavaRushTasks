package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    public String name,address,color;
    public int age, weight;

    public void initialize(Cat name){   //принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
        this.name=name.name;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }

    public void initialize(Cat name, Cat weight, Cat age){  //принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
        this.name=name.name;
        this.age=age.age;
        this.weight=weight.weight;
        this.color=color;
    }

    public void initialize(Cat name, Cat age){  //принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
        this.name=name.name;
        this.age=age.age;
        this.weight=weight;
        this.color=color;
    }

    public void initialize(Cat weight, Cat color) {  //принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
        this.age=age;
        this.weight=weight.weight;
        this.color=color.color;
    }

    public void initialize(Cat weight, Cat color, Cat address){   //принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
        this.age=age;
        this.weight=weight.weight;
        this.color=color.color;
        this.address=address.address;
    }

    public static void main(String[] args) {

    }
}
