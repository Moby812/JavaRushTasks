package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
    Zerg z1 = new Zerg();
    Zerg z2 = new Zerg();
    Zerg z3 = new Zerg();
    Zerg z4 = new Zerg();
    Zerg z5 = new Zerg();

        z1.name="Пылесос";
        z2.name="По";
        z3.name="Ляля";
        z4.name="Тинки-Винки";
        z5.name="Дипси";

    Protoss p1 = new Protoss();
    Protoss p2 = new Protoss();
    Protoss p3 = new Protoss();

        p1.name="Тралл";
        p2.name="Артас";
        p3.name="Иллидан";

    Terran t1 = new Terran();
    Terran t2 = new Terran();
    Terran t3 = new Terran();
    Terran t4 = new Terran();

        t1.name="Медив";
        t2.name="Джайна";
        t3.name="Сильва";
        t4.name="Кадгар";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
