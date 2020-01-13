package com.javarush.task.task05.task0514;

/* 
Программист создает человека
Создать class Person. У человека должно быть имя String name, возраст int age.
Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
В методе main создай объект Person, занеси его ссылку в переменную person.
Вызови метод initialize с любыми значениями.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person kurva = new Person();
        kurva.initialize("Kurva", 18);
    }

    static class Person {
        //напишите тут ваш код
        String name;
        int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}