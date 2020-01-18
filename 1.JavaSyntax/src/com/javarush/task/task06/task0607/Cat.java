package com.javarush.task.task06.task0607;

/* 
Классовый счетчик
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
*/

public class Cat {
    //напишите тут ваш код
    static int catCount =0;
    public Cat(){
        Cat.catCount++;
    }

    public static void main(String[] args) {

//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat();
//        Cat cat3 = new Cat();
//        System.out.println(Cat.catCount);
    }
}
