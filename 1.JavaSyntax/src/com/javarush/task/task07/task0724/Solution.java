package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
 Human grandPaOne = new Human("Александр", true, 80);
 Human grandPaTwo = new Human("Николай", true, 52);
 Human grandMaOne = new Human("Валентина", false, 86);
 Human grandMaTwo = new Human("Ольга", false, 52);
 Human pa = new Human("Павел", true, 31, grandPaOne, grandMaOne);
 Human ma = new Human("Катерина", false, 25, grandPaTwo, grandMaTwo);
 Human childOne = new Human("Олег", true,6, pa, ma);
 Human childTwo = new Human("Алиса", false,2, pa, ma);
 Human childThree = new Human("Кирилл", true,1, pa, ma);

        System.out.println(grandPaOne);
        System.out.println(grandPaTwo);
        System.out.println(grandMaOne);
        System.out.println(grandMaTwo);
        System.out.println(pa);
        System.out.println(ma);
        System.out.println(childOne);
        System.out.println(childTwo);
        System.out.println(childThree);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}