package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/*
https://javarush.ru/help/2310

Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код. Step 2
        ArrayList<Human> children = new ArrayList<>();

        ArrayList<Human> parentPa = new ArrayList<>();
        ArrayList<Human> parentMa = new ArrayList<>();

        parentPa.add(new Human("Павел", true, 30, children));
        parentMa.add(new Human("Катерина", false, 25, children));

        Human grandPaOne = new Human("Александр", true, 60, parentPa);
        Human grandPaTwo = new Human("Николай", true, 60, parentMa);
        Human grandMaOne = new Human("Валентина", false, 60, parentPa);
        Human grandMaTwo = new Human("Юля", false, 60, parentMa);

        children.add(new Human("Олег", true, 1));
        children.add(new Human("Кира", false, 4));
        children.add(new Human("Мартин", true, 3));

        //Step 3
        System.out.println(grandPaOne.toString());
        System.out.println(grandPaTwo.toString());
        System.out.println(grandMaOne.toString());
        System.out.println(grandMaTwo.toString());


        for (Human x: parentPa) System.out.println(x.toString());
        for (Human x: parentMa) System.out.println(x.toString());

        for (Human x: children) System.out.println(x.toString());
    }

    public static class Human {
        //напишите тут ваш код. Step 1
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (children != null) {                                                                                     //добавил условие, если детей вообще нет
            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
        }
            return text;
        }
    }
}
