package com.javarush.task.task04.task0403;

/* 
Как зовут кота?
Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.
*/

public class Cat {
    private String name = "безымянный кот";     //будет присваиваться каждому новому объекту по дефолту

    public void setName(String name) {
        //напишите тут ваш код
    this.name=name;                             //метод который заменяет знаение из переменной this.name на передаваемое в cat.setName
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");                   //переприсвоение значения переменной name при её заполнении
        System.out.println(cat.name);
    }
}
