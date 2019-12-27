package com.javarush.task.task02.task0204;

/* 
О семейных отношениях
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man();
        Woman woman = new Woman();
    man.wife = woman;
    woman.husband = man;
    woman.age = 25;
    man.age = 30;
    woman.name = "Kate";
    man.name = "Pol";

        System.out.println(man.name +" love "+ woman.name);
    }

    public static class Man {
        public int age;
        public String name;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public String name;
        public Man husband;
    }
}
