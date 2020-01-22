package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

1. Программа должна считывать имена 6 котов в указанном порядке.
2. Метод main должен создавать 6 объектов типа Cat.
3. Программа должна выводить 6 строк с информацией о котах.
4. Строка про дедушку (первая) должна соответствовать условию.
5. Строка про бабушку (вторая) должна соответствовать условию.
6. Строка про папу (третья) должна соответствовать условию.
7. Строка про маму (четвертая) должна соответствовать условию.
8. Строка про сына (пятая) должна соответствовать условию.
9. Строка про дочь (шестая) должна соответствовать условию.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();         //дедушка
//        String grandFatherName = "дедушка Вася";
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();         //бабушка
//        String grandMotherName = "бабушка Мурка";
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();              //папа (+дедушка)
//        String fatherName = "папа Котофей";
        Cat catFather = new Cat(fatherName, catGrandFather, null);

        String motherName = reader.readLine();              //мама (+бабушка)
//        String motherName = "мама Василиса";
        Cat catMother = new Cat(motherName, null,catGrandMother);

        String sonName = reader.readLine();                  //сын (+папа, +мама)
//        String sonName = "сын Мурчик";
        Cat catSon = new Cat(sonName, catFather, catMother, null,null);


        String daughterName = reader.readLine();            //дочь (+папа, +мама)
//        String daughterName = "дочь Пушинка";
        Cat catDaughter = new Cat(daughterName, catFather, catMother, null,null);


        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentFather;
        private Cat parentMother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentFather, Cat parentMother) {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }

        Cat(String name, Cat parentFather, Cat parentMother, Cat parentGrandFather, Cat parentGrandMother) {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }

        @Override
        public String toString() {
            if (parentFather != null && parentMother == null) return "The cat's name is " + name + ", no mother" + ", father is " +parentFather.name;
            else if (parentFather == null && parentMother != null) return "The cat's name is " + name + ", mother is " + parentMother.name+ ", no father";
            else if (parentFather != null) return "The cat's name is " + name + ", mother is " + parentMother.name +", father is "+ parentFather.name;
            else return "The cat's name is " + name + ", no mother" + ", no father";

        }
    }
}
