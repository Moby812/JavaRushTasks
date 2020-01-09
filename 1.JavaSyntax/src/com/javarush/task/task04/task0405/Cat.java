package com.javarush.task.task04.task0405;

/* 
Задаем количество котов
Метод setCatsCount класса Cat должен устанавливать значение переменной catsCount равным переданному параметру.
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        //напишите тут ваш код
        Cat.catsCount = catsCount;
    }

    public static void main(String[] args) {
    }
}