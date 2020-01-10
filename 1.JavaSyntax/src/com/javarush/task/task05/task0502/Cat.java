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

    Cat cat1 = new Cat(5, 15,5);
    Cat cat2 = new Cat(3,13,4);

    public Cat() {              //пустой конструктор
    }

    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int winCat1 = 0;
        int winCat2 = 0;

        if (cat1.age < cat2.age)
            winCat1++;
        else
            winCat2++;

        if (cat1.weight > cat2.weight)
            winCat1++;
        else
            winCat2++;

        if (cat1.strength > cat2.strength)
            winCat1++;
        else
            winCat2++;

        return winCat1 > winCat2;
    }

    public static void main(String[] args) {



    }
}
