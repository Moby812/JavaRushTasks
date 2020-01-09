package com.javarush.task.task04;

public class Family {
    public static int count;

    public static class Human {
        private String surname = "Paramonov";
        private String name = "Incognita";
        private int age;

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void addFamily() {
        count++;
    }

    public static void main(String[] args) {

        Human pavel = new Human();
        pavel.setName("Pavel");
        pavel.age = 30;
        addFamily();

        Human kate = new Human();
        kate.setName("Kate");
        kate.surname += "a";
        kate.age = 25;
        addFamily();

        Human oleg = new Human();
        oleg.setName("Oleg");
        oleg.age = 1;
        addFamily();

        System.out.println(pavel.surname+" "+pavel.name+" + "+kate.surname+" "+kate.name+" = "+oleg.name);
        System.out.println("Family members = "+count);
    }
}