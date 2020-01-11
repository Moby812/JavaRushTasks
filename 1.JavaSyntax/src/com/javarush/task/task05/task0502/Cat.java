package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {              //пустой конструктор
    }

//    public Cat(int age, int weight, int strength) {           //конструктор в который передаём параметры
//        this.age = age;
//        this.weight = weight;
//        this.strength = strength;
//    }

//    public boolean fight(Cat anotherCat) {
//        int point = Integer.compare(this.age, anotherCat.age) + Integer.compare(this.weight, anotherCat.weight) +
//                Integer.compare(this.strength, anotherCat.strength);
//        return point > 0;
//    }

/*
Метод compare - сравнение двух int. Возвращает int.
Синтаксис: public static int compare(int x,int y)
- ноль, если x и y равны друг другу
- минус 1 (точнее меньше нуля) если x меньше y
- плюс 1 (больше чем ноль) если x больше y
 */

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int winCat1 = 0;
        int winCat2 = 0;

        if (this.age > anotherCat.age) winCat1++;
        else if (this.age < anotherCat.age) winCat2++;

        if (this.weight > anotherCat.weight) winCat1++;
        else if (this.weight < anotherCat.weight) winCat2++;

        if (this.strength > anotherCat.strength) winCat1++;
        else if (this.strength < anotherCat.strength) winCat2++;

        return winCat1 > winCat2;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.age = 10;
        cat1.weight = 1;
        cat1.strength = 1;

        Cat cat2 = new Cat();
        cat2.age = 1;
        cat2.weight = 1;
        cat2.strength = 1;
    }
}