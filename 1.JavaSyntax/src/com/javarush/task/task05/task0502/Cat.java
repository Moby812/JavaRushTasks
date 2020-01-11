package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight

Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {              //пустой конструктор
    }

//    public Cat(int age, int weight, int strength) {
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

        if (this.age > anotherCat.age)
            winCat1++;
        else
            winCat2++;

        if (this.weight > anotherCat.weight)
            winCat1++;
        else
            winCat2++;

        if (this.strength > anotherCat.strength)
            winCat1++;
        else
            winCat2++;

        return winCat1 > winCat2;
    }

    public static void main(String[] args) {

//    Cat cat1 = new Cat(5, 15,5);
//    Cat cat2 = new Cat(3,13,4);

        Cat cat1 = new Cat();
        cat1.age = 5;
        cat1.weight = 15;
        cat1.strength = 5;

        Cat cat2 = new Cat();
        cat2.age = 3;
        cat2.weight = 13;
        cat2.strength = 4;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}