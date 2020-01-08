package com.javarush.task.task03;

public class Main {
    public static void main (String [] args){

        Cat cat = new Cat();
        String text = "Cat is " + cat;
        System.out.println(text);
    }

public static class Cat {
        String name = "Рыжик";
    }

}
