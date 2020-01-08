package com.javarush.task.task04.task0406;

/* 
Программа учета имен
Метод setName класса Cat должен устанавливать значение глобальной переменной private String fullName равным локальной переменной fullName.
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        //напишите тут ваш код
        this.fullName=fullName;                     //Обращение к одноимённой переменной класса в методе через this.
    }

    public static void main(String[] args) {

    }
}
